package Lesson3.Contract;

import Lesson3.Interface.Imethod;

import java.util.Date;

public class ContractWithEmployees extends Documents implements Imethod {

    Date contractsEnd = new Date(2022, 06, 7);
    String nameOfEmployee;

    public ContractWithEmployees() {
    }

    public ContractWithEmployees(int numberOfDocument, String nameOfEmployee) {
        Date contractsEnd;
        this.nameOfEmployee = nameOfEmployee;
        Date dateOfDocument;
        this.numberOfDocument = numberOfDocument;
    }

    @Override
    public void showInformationaboutDocumnet(Documents name) {
        System.out.println(name.toString());
    }

    @Override
    public String toString() {
        return "ContractWithEmployees [contractsEnd= " + contractsEnd + ", nameOfEmployee= " + nameOfEmployee
                + ", dateOfDocument = " + dateOfDocument + ", numberOfDocument  " + numberOfDocument + "]";
    }

}
