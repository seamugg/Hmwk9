public class Main {
    public static void main(String[] args){

        LoginPage page = new LoginPage();

        page.clickLoginField();
        page.enterLogin("sammy@testpro.io");
        page.enterPassword("pa$$word");
        page.submit();
    }
}