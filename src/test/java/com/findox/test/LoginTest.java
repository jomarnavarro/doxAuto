package com.findox.test;

import com.findox.exception.ImplementationMissingException;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test( groups = {"login"})
    public void validEmployeeLogin() throws ImplementationMissingException {
        throw new ImplementationMissingException();
    }

    @Test( groups = {"login"})
    public void validAdminLogin() throws ImplementationMissingException {
        throw new ImplementationMissingException();
    }

    @Test( groups = {"login"})
    public void validEmployeeLoginExtraKeysPayload() throws ImplementationMissingException {
        throw new ImplementationMissingException();
    }

    @Test( groups = {"login"})
    public void invalidLoginMissingCreds() throws ImplementationMissingException {
        throw new ImplementationMissingException();
    }

    @Test( groups = {"login"})
    public void invalidLoginBlankCreds() throws ImplementationMissingException {
        throw new ImplementationMissingException();
    }

    @Test( groups = {"login"})
    public void invalidLoginNoPayload() throws ImplementationMissingException {
        throw new ImplementationMissingException();
    }
}
