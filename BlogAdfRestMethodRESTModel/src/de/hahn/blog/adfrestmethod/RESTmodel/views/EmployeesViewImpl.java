package de.hahn.blog.adfrestmethod.RESTmodel.views;

import de.hahn.blog.adfrestmethod.RESTmodel.views.common.EmployeesView;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Jan 30 16:09:50 CET 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class EmployeesViewImpl extends ViewObjectImpl implements EmployeesView {
    /**
     * This is the default constructor (do not remove).
     */
    public EmployeesViewImpl() {
    }

    public String getVersionInfo() {
        return "Version 1.0";
    }

    public String sayHello(String name) {
        return "Hello " + name;
    }
}

