public class LoginPage extends BasePage{

    public void clickLoginField(){
        System.out.println("Clicking Login Field");
    }
    public void enterLogin(String login){
        System.out.println("Clicking Login Field" + login);

              }
    public void enterPassword(String password){
        System.out.println("Enter password : " + password);
    }

    public void submit(){
        System.out.println("clicking submit");
    }
}
