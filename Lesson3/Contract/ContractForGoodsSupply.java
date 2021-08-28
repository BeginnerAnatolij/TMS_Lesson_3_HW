package Lesson3.Contract;

import Lesson3.Interface.Imethod;

public class ContractForGoodsSupply extends Documents implements Imethod {

    String typeOfGoods;
    int amountOfGoods;

    public ContractForGoodsSupply() {
    }

    public ContractForGoodsSupply(int numberOfDocument, String typeOfGoods, int amountOfGoods) {
        this.numberOfDocument = numberOfDocument;
        this.amountOfGoods = amountOfGoods;
        this.typeOfGoods = typeOfGoods;
    }

    @Override
    public void showInformationaboutDocumnet(Documents name) {
        System.out.println(name.toString());
    }

    @Override
    public String toString() {
        return "ContractForGoodSupply [numberOfDocument= " + numberOfDocument + ", amountOfGoods= "
                + amountOfGoods + ", typeOfGoods= " + typeOfGoods + ", dateOfDocument= " + dateOfDocument + "]";
    }
}
