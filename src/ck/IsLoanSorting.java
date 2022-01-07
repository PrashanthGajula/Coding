package ck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IsLoanSorting
{

    public static void main(final String[] args)
    {
        final Loan l1 = new Loan(1, "Wells", true, 7);
        final Loan l2 = new Loan(2, "Amex", false, 4);
        final Loan l3 = new Loan(3, "Chase", true, 2);
        final Loan l4 = new Loan(4, "Wells", false, 5);
        final Loan l5 = new Loan(5, "Amex", true, 6);
        final Loan l6 = new Loan(6, "Bofa", false, 9);
        final Loan l7 = new Loan(7, "Wells", false, 8);
        final Loan l8 = new Loan(8, "Chase", true, 2);
        final Loan l9 = new Loan(9, "Wells", false, 4);
        final Loan l10 = new Loan(10, "Wells", true, 6);

        final int pageSize = 3;
        final List<Loan> loans = Arrays.asList(l1, l2, l3, l4, l5, l6, l7, l8, l9, l10);
        Collections.sort(loans, (a, b) -> (a.rate - b.rate));

        final List<List<Loan>> loanPages = new ArrayList<>();
        int numberOfPages = 0;
        final List<Loan> nonPreApproved = new ArrayList<>();

        for (final Loan loan : loans)
        {
            if (loan.preApproved)
            {
                final List<Loan> li = Arrays.asList(loan);
                loanPages.add(li);
                numberOfPages++;
            }
            else
            {
                nonPreApproved.add(loan);
            }
        }

        for (final Loan loan : nonPreApproved)
        {
            for(int i=0;i<loanPages.size();i++) {
                List<Loan> tempPage
                if(loanPages.get(i).size() < pageSize) {
                    loanPages.get(i)
                }
            }
        }
    }

    static void display(final List<Loan> loans)
    {
        loans.stream().forEach(loan -> System.out.println(loan.id + "\t" + loan.rate + "\t" + loan.lender + "\t" + loan.preApproved));
    }

    static class Loan
    {
        int id;
        String lender;
        boolean preApproved;
        int rate;

        Loan(final int id, final String lender, final boolean preApproved, final int rate)
        {
            this.id = id;
            this.lender = lender;
            this.preApproved = preApproved;
            this.rate = rate;
        }
    }
}
