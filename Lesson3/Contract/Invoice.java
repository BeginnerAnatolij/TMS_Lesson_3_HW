package Lesson3.Contract;

import Lesson3.Interface.Imethod;

import java.util.Date;

public class Invoice extends Documents implements Imethod {
    int codeOfDepartment;
    int finalSum;

    public Invoice() {
    }

    public Invoice(int numberOfDocument, int codeOfDepartment, int finalSum) {
        this.codeOfDepartment = codeOfDepartment;
        this.finalSum = finalSum;
        Date dateOfDocument;
        this.numberOfDocument = numberOfDocument;
    }

    @Override
    public void showInformationaboutDocumnet(Documents name) {
        System.out.println(name.toString());
    }

    @Override
    public String toString() {
        return "Invoice [codeOfDepartment= " + codeOfDepartment + ", finalSum= " + finalSum
                + ", dateOfDocument = " + dateOfDocument + ", numberOfDocument= " + numberOfDocument + "]";
    }
}
