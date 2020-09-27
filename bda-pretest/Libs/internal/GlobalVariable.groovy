package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object SignIn_url
     
    /**
     * <p></p>
     */
    public static Object U_fullname
     
    /**
     * <p></p>
     */
    public static Object U_Email
     
    /**
     * <p></p>
     */
    public static Object U_password
     
    /**
     * <p></p>
     */
    public static Object U_Email_not_delete
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            SignIn_url = selectedVariables['SignIn_url']
            U_fullname = selectedVariables['U_fullname']
            U_Email = selectedVariables['U_Email']
            U_password = selectedVariables['U_password']
            U_Email_not_delete = selectedVariables['U_Email_not_delete']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
