package org.openjfx.model;

public class YMProjectTestBiz1 extends YMProjectTestBase{
    public YMProjectTestBiz1(String testName) {
        super(testName);
    }

    public YMProjectTestBiz1(String testName, int objectNum) {
        super(testName, objectNum);
    }

    @Override
    protected void setTestNum() {
        this.testNum = (int) (this.objectNum * 0.1);
    }

    @Override
    protected void setUnitName() {
        this.unitName = "根";
    }

    @Override
    protected void setPrice() {
        if (objectCondition < 500) {
            this.Price = 1000;
        } else if (objectCondition < 1000) {
            this.Price = 2000;
        } else {
            this.Price = 3000;
        }
    }
}
