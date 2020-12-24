import java.util.ArrayList;
import java.util.List;

public class UniqueEmailAddresses {
    public static void main(String[] args) {
        //String[] emails={"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        //String[] emails={"testemail@leetcode.com","testemail1@leetcode.com","testemail+david@lee.tcode.com"};
        String[] emails={"j+ezsorqlmc@rfpycgjuf.com",
                "j+k+ri+rigt.ad@rfpycgjuf.com",
                "hfmeqzk.isx+i@fiidmdrsu.com",
                "j+p+h+d+d+p+z.j.k.g@rfpycgjuf.com",
                "zygekdy.l.w+s@snh.owpyu.com",
                "j+m.l+ia+qdgv+w@rfpycgjuf.com",
                "r+hwbjwefkp@wcjaki.n.com",
                "zygekdy.l.w+d@snh.owpyu.com",
                "bizdm+sz.f.a.k@il.cjjlp.com",
                "hfmeqzk.isx+t@fiidmdrsu.com",
                "hfmeqzk.isx+i@fiidmdrsu.com",
                "bizdm+f+j+m.l.l@il.cjjlp.com",
                "zygekdy.l.w+g@snh.owpyu.com",
                "r+evgvxmksf@wcjaki.n.com",
                "hfmeqzk.isx+h@fiidmdrsu.com",
                "bizdm+lov+cy@il.cjjlp.com",
                "hfmeqzk.isx+o@fiidmdrsu.com",
                "bizdm+hs+qao@il.cjjlp.com",
                "r+v+z+rcuznrj@wcjaki.n.com",
                "j+r.kn+h.w.a.h+bh@rfpycgjuf.com",
                "hfmeqzk.isx+t@fiidmdrsu.com",
                "hfmeqzk.isx+a@fiidmdrsu.com",
                "zygekdy.l.w+o@snh.owpyu.com",
                "zygekdy.l.w+i@snh.owpyu.com",
                "r+vy.u.y+f.er+aw@wcjaki.n.com",
                "zygekdy.l.w+c@snh.owpyu.com",
                "bizdm+wztzg@il.cjjlp.com",
                "j+h.fwbsr+chp@rfpycgjuf.com",
                "zygekdy.l.w+s@snh.owpyu.com",
                "zygekdy.l.w+d@snh.owpyu.com",
                "bizdm+qq.o.q+p@il.cjjlp.com",
                "zygekdy.l.w+o@snh.owpyu.com",
                "j+c+zqbq+h.dyt@rfpycgjuf.com",
                "r+hl.b.i+fz.hz.t@wcjaki.n.com",
                "r+cbabpf.k+w+e@wcjaki.n.com"};
        //String[] emails={"@"};
        System.out.println(numUniqueEmails(emails));
    }


    public static int numUniqueEmails(String[] emails) {
        List<String> list = new ArrayList<>();
        for (String email: emails) {
            String temp = email.substring(0,email.indexOf("@"));
            String domainName = email.substring(email.indexOf("@")+1);
            if(temp.contains("+"))
                temp = temp.substring(0,temp.indexOf("+"));

            temp = temp.replace(".","");
            String res = temp+"@"+domainName;
            if(!list.contains(res))
               list.add(res);
            }
        return list.size();
    }
}