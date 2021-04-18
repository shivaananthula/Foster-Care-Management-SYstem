/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.NgoVolunteerRole;
import Business.Role.Role;
import Business.Role.TreasurerRole;
import java.util.ArrayList;

/**
 *
 * @author Deepika Reddy
 */
public class FundRaiserEnterprise extends Enterprise{
    
    public FundRaiserEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Rental);
    }

    @Override

    public ArrayList<Role> getSupportedRole() {
        roles = new ArrayList<Role>();
        roles.add(new TreasurerRole());
        roles.add(new NgoVolunteerRole());
        return roles;
    }
    
}
