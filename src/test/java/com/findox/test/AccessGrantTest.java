package com.findox.test;

import com.findox.exception.ImplementationMissingException;
import org.testng.annotations.Test;

public class AccessGrantTest extends BaseTest {

    @Test( groups = {"accessAdd"})
    public void adminGrantsEmployeeAccessToValidDocument() throws ImplementationMissingException {
        throw new ImplementationMissingException();
    }

    @Test( groups = {"accessAdd"})
    public void adminShouldNotGrantAccessToOtherAdmins() throws ImplementationMissingException {
        throw new ImplementationMissingException();
    }

    @Test( groups = {"accessAdd"})
    public void adminAttemptsToGrantAccessToEmployeeInvalidDocId() throws ImplementationMissingException {
        throw new ImplementationMissingException();
    }

    @Test( groups = {"accessAdd"})
    public void adminAttemptsToGrantAccessToInvalidEmployeeId() throws ImplementationMissingException {
        throw new ImplementationMissingException();
    }

    @Test( groups = {"accessAdd"})
    public void adminAttemptsToGrantAccessToEmployeeDeletedDocumentId() throws ImplementationMissingException {
        throw new ImplementationMissingException();
    }
}
