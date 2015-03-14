/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animohacks;

/**
 *
 * @author Kingston
 */
public class Post
{
    private String company_id;
    private String message;
    private String item1;
    private String item2;
    private String item3;
    private String item4;
    private String item5;
    private String quan1;
    private String quan2;
    private String quan3;
    private String quan4;
    private String quan5;
    private String donated;
    private String target;

    public Post(String company_id, String message, String item1, String item2, String item3, String item4, String item5, String quan1, String quan2, String quan3, String quan4, String quan5, String donated, String target)
    {
        this.company_id = company_id;
        this.message = message;
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
        this.item4 = item4;
        this.item5 = item5;
        this.quan1 = quan1;
        this.quan2 = quan2;
        this.quan3 = quan3;
        this.quan4 = quan4;
        this.quan5 = quan5;
        this.donated = donated;
        this.target = target;
    }

    public String getCompany_id()
    {
        return company_id;
    }

    public void setCompany_id(String company_id)
    {
        this.company_id = company_id;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public String getItem1()
    {
        return item1;
    }

    public void setItem1(String item1)
    {
        this.item1 = item1;
    }

    public String getItem2()
    {
        return item2;
    }

    public void setItem2(String item2)
    {
        this.item2 = item2;
    }

    public String getItem3()
    {
        return item3;
    }

    public void setItem3(String item3)
    {
        this.item3 = item3;
    }

    public String getItem4()
    {
        return item4;
    }

    public void setItem4(String item4)
    {
        this.item4 = item4;
    }

    public String getItem5()
    {
        return item5;
    }

    public void setItem5(String item5)
    {
        this.item5 = item5;
    }

    public String getQuan1()
    {
        return quan1;
    }

    public void setQuan1(String quan1)
    {
        this.quan1 = quan1;
    }

    public String getQuan2()
    {
        return quan2;
    }

    public void setQuan2(String quan2)
    {
        this.quan2 = quan2;
    }

    public String getQuan3()
    {
        return quan3;
    }

    public void setQuan3(String quan3)
    {
        this.quan3 = quan3;
    }

    public String getQuan4()
    {
        return quan4;
    }

    public void setQuan4(String quan4)
    {
        this.quan4 = quan4;
    }

    public String getQuan5()
    {
        return quan5;
    }

    public void setQuan5(String quan5)
    {
        this.quan5 = quan5;
    }

    public String getDonated()
    {
        return donated;
    }

    public void setDonated(String donated)
    {
        this.donated = donated;
    }

    public String getTarget()
    {
        return target;
    }

    public void setTarget(String target)
    {
        this.target = target;
    }

      
    
    
}
