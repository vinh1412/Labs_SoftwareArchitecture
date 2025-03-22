/*
 * @ {#} NhaThau.java   1.0     15/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package CoPhieu;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   15/03/2025
 * @version:    1.0
 */
public class NhaThau implements Observer {
    private String name;
    private String age;

    private Subject topic;

    public NhaThau(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void update() {
        double gia = (double) topic.getUpdate(this);
        if(gia == 0){
            System.out.println(name+":: Khong co thong tin moi");
        }else{
            System.out.println(name+":: Gia co phieu moi::"+gia);
        }
    }

    @Override
    public void setSubject(Subject sub) {
        this.topic=sub;
    }
}
