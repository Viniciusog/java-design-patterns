package org.viniciusog.patterns.behavioral.chain.billsDispenser;

public class Bill {

    private Integer value;
    private Bill next;

    public Bill(Integer value) {
        this.value = value;
    }

    public Bill(Integer value, Bill next) {
        this.value = value;
        this.next = next;
    }

    public void setNext(Bill bill) {
        this.next = bill;
    }

    public void execute(Integer remaining) {
        if (remaining >= value) {
            int bills = remaining / value;
            remaining = remaining % value;
            System.out.printf("\n%d bills of %d. %d remaining.", bills, value, remaining);
        }
        if (remaining == 0) return;
        if (next != null) next.execute(remaining);
    }
}