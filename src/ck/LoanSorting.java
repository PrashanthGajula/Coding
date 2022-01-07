package ck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LoanSorting
{

    public static void main(final String[] args)
    {
        final loan l1 = new loan(1, "Wells", true, 7);
        final loan l2 = new loan(2, "Amex", false, 4);
        final loan l3 = new loan(3, "Chase", true, 2);
        final loan l4 = new loan(4, "Wells", false, 5);
        final loan l5 = new loan(5, "Amex", true, 6);
        final loan l6 = new loan(6, "Bofa", false, 9);
        final loan l7 = new loan(7, "Wells", false, 8);
        final loan l8 = new loan(8, "Chase", true, 2);
        final loan l9 = new loan(9, "Wells", false, 4);
        final loan l10 = new loan(10, "Wells", true, 6);

        final int pageSize = 3;
        final List<loan> loans = Arrays.asList(l1, l2, l3, l4, l5, l6, l7, l8, l9, l10);

        // loans.stream().forEach(l -> System.out.println(l.id + " " + l.interestRate + " " + l.lender + " " + l.preApproved));

        Collections.sort(loans, (a, b) -> (a.interestRate - b.interestRate));
        System.out.println("-----------------------------------");
        System.out.println("ID" + '\t' + "Rate" + '\t' + "Lender" + '\t' + "PreApproved");
        System.out.println("-----------------------------------");
        // loans.stream().forEach(l -> System.out.println(l.id + "\t" + l.interestRate + "\t" + l.lender + "\t" + l.preApproved));

        List<List<loan>> pages = paginateList(loans, pageSize);
        // display(pages);

        System.out.println();
        pages = subListSortByPreApproval(pages);
        display(pages);
    }

    static List<List<loan>> distributeMultipleLenders(final List<List<loan>> loans)
    {
        final List<loan> tl = new ArrayList<>();

        for (int i = 0; i < loans.size(); i++)
        {
            final List<loan> ml = loans.get(i);

        }
        return null;
    }

    static List<List<loan>> subListSortByPreApproval(final List<List<loan>> li)
    {
        for (final List<loan> i : li)
        {
            Collections.sort(i, (a, b) -> Boolean.compare(b.preApproved, a.preApproved));
        }
        return li;
    }

    static List<List<loan>> paginateList(final List<loan> loans, final int pageSize)
    {
        final List<List<loan>> result = new ArrayList<>();

        for (int i = 0; i < loans.size(); i = i + pageSize)
        {
            final List<loan> tempLi = new ArrayList<>();
            final int start = i;
            final int end = i + pageSize;
            for (int j = start; j < end; j++)
            {
                if (j == loans.size())
                {
                    break;
                }
                tempLi.add(loans.get(j));
            }
            // System.out.println(tempLi.size());
            result.add(tempLi);
        }
        return result;
    }

    static void display(final List<List<loan>> pages)
    {
        for (final List<loan> i : pages)
        {
            i.stream().forEach(l -> System.out.println(l.id + "\t" + l.interestRate + "\t" + l.lender + "\t" + l.preApproved));
            System.out.println("..............................");
        }
    }

    static class loan
    {
        int id;
        String lender;
        boolean preApproved;
        int interestRate;

        loan(final int id, final String lender, final boolean preApproved, final int interestRate)
        {
            this.id = id;
            this.lender = lender;
            this.preApproved = preApproved;
            this.interestRate = interestRate;
        }
    }
}
