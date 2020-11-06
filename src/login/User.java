/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

/**
 *
 * @author aline
 */
class User {
    
    private String um;
    private String dois;
    
    public User(String um, String dois){
        this.um = um;
        this.dois = dois;
    }
    
    public String getUm(){
        return um;
    }
    
    public String getDois(){
        return dois;
    }

}

