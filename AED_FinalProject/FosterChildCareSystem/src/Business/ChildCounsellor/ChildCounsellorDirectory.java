/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ChildCounsellor;

import Business.Parent.Parent;
import java.util.ArrayList;

/**
 *
 * @author shiva
 */
public class ChildCounsellorDirectory {
    public ArrayList<ChildCounsellor> ChildCounsellorList;

    public ChildCounsellorDirectory() {
        this.ChildCounsellorList = new ArrayList<ChildCounsellor>();
    }

    public ArrayList<ChildCounsellor> getChildCounsellorList() {
        return ChildCounsellorList;
    }

    public void setChildCounsellorList(ArrayList<ChildCounsellor> ChildCounsellorList) {
        this.ChildCounsellorList = ChildCounsellorList;
    }

    public void add(ChildCounsellor childCounsellor){
        this.ChildCounsellorList.add(childCounsellor);
    }
    
    public ChildCounsellor getChildCounsellorById(int childCounsellorId){
        for(ChildCounsellor c : this.ChildCounsellorList){
            if(c.getChildCounsellorId()== childCounsellorId){
                return c;
            }
        }
        return null;
    }
    
    public boolean isPhoneUnique(String phone){
        for(ChildCounsellor ch: this.ChildCounsellorList){
            if(ch.getPhoneNumber().equalsIgnoreCase(phone)){
                return false;
            }
        }
        return true;
    }
    
    public boolean isEmailUnique(String email){
        for(ChildCounsellor ch: this.ChildCounsellorList){
            if(ch.getEmail().equalsIgnoreCase(email)){
                return false;
            }
        }
        return true;
    }
    
    public void updateChildCounsellor(int id, String parentName, String parentPhone, String address ,String parentEmail ){
        for(ChildCounsellor ch: this.ChildCounsellorList){
            if(ch.getChildCounsellorId()== id){
                ch.setName(parentName);
                ch.setPhoneNumber(parentPhone);
                ch.setAddress(address);
                ch.setEmail(parentEmail);
            }
        }
    }
    
    public void DeleteChildCounsellor(int id){
        ChildCounsellor toDelete = null;
        for(ChildCounsellor childCounsellor: this.ChildCounsellorList){
            if(childCounsellor.getChildCounsellorId()== id){
                toDelete = childCounsellor;
            }
        }
        
        if(toDelete != null){
            this.ChildCounsellorList.remove(toDelete);
        }
    }
}
