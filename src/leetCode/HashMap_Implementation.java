package leetCode;

import java.util.ArrayList;

public class HashMap_Implementation<k,v>
{
    class HashNode<k,v>{
        k key;
        v value;
        HashNode<k,v> next;
        HashNode(final k key, final v value){
            this.key=key;
            this.value=value;
            this.next = null;
        }
    }
    private final ArrayList<HashNode<k, v>> bucketList=null;
    private int size=0;
    private int numberOfBuckets=0;

    HashMap_Implementation(){
        numberOfBuckets=10;
        size=0;
        for(int i=0;i<numberOfBuckets;i++){
            bucketList.add(null);
        }
    }

    public void put(final k newKey, final v newValue){
        final int index = newKey.hashCode() % numberOfBuckets;
        HashNode<k, v> head = bucketList.get(index);
        while(head!=null){
            if(head.key.equals(newKey)){
                head.value = newValue;
            }
            head=head.next;
        }
        size++;
        head = bucketList.get(index);
        final HashNode<k, v> newNode = new HashNode<k, v>(newKey, newValue);
        newNode.next=head;
        bucketList.set(index, newNode);
    }

    public boolean contains(final k newKey){
        final int index = newKey.hashCode()%numberOfBuckets;
        HashNode<k, v> head = bucketList.get(index);
        if(head==null){
            return false;
        }
        while(head!=null){
            if(head.key.equals(newKey)){
                return true;
            }
            head=head.next;
        }
        return false;
    }

    public v remove(final k newKey){
        final int index = newKey.hashCode()%numberOfBuckets;
        HashNode<k, v> prev = null;
        HashNode<k, v> head = bucketList.get(index);

        while(head!=null){
            if(head.key.equals(newKey)){
                break;
            }
            prev = head;
            head=head.next;
        }

        size--;
        if(prev==null){
            bucketList.set(index, head.next);
        }else{
            prev.next=head.next;
        }
        return head.value;
    }

    public static void main(final String[] args)
    {
        final HashMap_Implementation<String, Integer> hmi = new HashMap_Implementation<>();
        hmi.put("one", 1);
        hmi.put("two", 2);
        hmi.put("three", 3);
        System.out.println(hmi.contains("one"));

    }

}
