package org.jhveras.hr.persistence.entities;

import java.math.BigDecimal;
import java.sql.Date;

@Entity
public class Employee {

    @Id
    private Long employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Date hireDate;
    private BigDecimal salary;
    private BigDecimal commissionPct;

    // private Employee managerId;
    // private Department departmentId;
    // private Job jobId;

    /**
     * @return the employeeId
     */
    public Long getEmployeeId() {
        return employeeId;
    }

    /**
     * @param employeeId the employeeId to set
     */
    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the commissionPct
     */
    public BigDecimal getCommissionPct() {
        return commissionPct;
    }

    /**
     * @param commissionPct the commissionPct to set
     */
    public void setCommissionPct(BigDecimal commissionPct) {
        this.commissionPct = commissionPct;
    }

    /**
     * @return the hireDate
     */
    public Date getHireDate() {
        return hireDate;
    }

    /**
     * @param hireDate the hireDate to set
     */
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    /**
     * @return the salary
     */
    public BigDecimal getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}