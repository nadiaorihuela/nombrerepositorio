package paginas;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;


public class paginaLogin {
	WebDriver driver;
	@FindBy (id="email_create")
	WebElement txtEmail;
	
	@FindBy (id="SubmitCreate")
	WebElement btnCreate;
	
	@FindBy (xpath="//*[@id=\"center_column\"]/h1")
	WebElement tituloForm;
	
	@FindBy (id="email")
	WebElement txtEmailLogin;
	
	@FindBy (id="passwd")
	WebElement txtClaveLogin;
	
	@FindBy (id="SubmitLogin")
	WebElement btnLogin;
    
	public paginaLogin(WebDriver driver){
        this.driver = driver;
        //Inicializa los elementos con una espera implicita
        PageFactory.initElements(new AjaxElementLocatorFactory (driver,20), this);}
    
    public void sendKeysEmail(String email) {
    	txtEmail.sendKeys(email);
    }
    
    public void clickCreate() 
    {
    	btnCreate.click();
    }
    
    public String getTextTitleForm(){
    	return tituloForm.getText();
    	
    }

	public void inicioSesion(String usuario, String clave) {
		txtEmailLogin.clear();
		txtEmailLogin.sendKeys(usuario);
		txtClaveLogin.clear();
		txtClaveLogin.sendKeys(clave);
		btnLogin.click();
	}

    
}
