package Lesson3;

import Lesson3.Contract.ContractForGoodsSupply;
import Lesson3.Contract.ContractWithEmployees;
import Lesson3.Contract.Invoice;

public class Main {
    public static void main(String[] args) {
        ContractForGoodsSupply toys = new ContractForGoodsSupply(1, "Spider man toys", 100);
        ContractWithEmployees john = new ContractWithEmployees(2, "John ");
        Invoice financialDepartment = new Invoice(5, 1010, 205421432);
        System.out.println("--------------------------");
        toys.showInformationaboutDocumnet(toys);
        System.out.println("--------------------------");
        john.showInformationaboutDocumnet(john);
        System.out.println("--------------------------");
        financialDepartment.showInformationaboutDocumnet(financialDepartment);

    }
}
