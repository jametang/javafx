package org.openjfx.model;

public abstract class YMProjectTestBase {

    /**
     * 测试项名称(用户输入)
     */
    private String testName;

    /**
     * 测试项对象总件(用户手动输入)
     */
    protected int objectNum;

    /**
     * 测试项条件(用户手动输入)
     */
    protected int objectCondition;

    /**
     * 测试数量
     */
    protected int testNum;

    /**
     * 测试单位
     */
    protected String unitName;

    /**
     * 测试价格
     */
    protected int Price;


    public YMProjectTestBase(String testName) {
        this.testName = testName;
        setData();
    }

    public YMProjectTestBase(String testName, int objectNum) {
        this(testName);
        this.objectNum = objectNum;
    }

    public void setData(){
        setUnitName();
        setTestNum();
        setPrice();
    }

    protected abstract void setTestNum();
    protected abstract void setUnitName();
    protected abstract void setPrice();

    public int getTotalPrice(){
        return testNum * Price;
    }

    public String getTestName() {
        return testName;
    }

    public int getObjectNum() {
        return objectNum;
    }

    public String getUnitName() {
        return unitName;
    }

    public int getTestNum() {
        return testNum;
    }

    public int getPrice() {
        return Price;
    }
}
