package testBase;


import pages.DashboardPageElements;
import pages.LoginPageElements;
import pages.MainLoginPageElements;

public class PageInitializer extends BaseClass {

    public static LoginPageElements login;
    public static DashboardPageElements dash;
    public static MainLoginPageElements main;


    public static void initializePageObjects(){
        login = new LoginPageElements();
        dash = new DashboardPageElements();
        main = new MainLoginPageElements();
    }

}
