
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linhp
 */
public class QLDS implements IQLDS {
    ArrayList<CaNhan> ds;
    public QLDS() {
        ds = new ArrayList<CaNhan>();
    }
    public int them(CaNhan p) {
        ds.add(p);
        return ds.size();
    }
    public int xoa(String ten) {
        int i;
        boolean check = true;
        for (i = 0; i < ds.size(); i++) {
            if (ds.get(i).getHoTen().equals(ten)) {
                check = false;
                break;                
            }
        }
        if (check == false) {
            return -1;
        } else {
            return i;
        }
        
    }
    public void  inDS() {
        for (CaNhan i : ds) {
            System.out.println(i.hienTT());
        }
    }
}
