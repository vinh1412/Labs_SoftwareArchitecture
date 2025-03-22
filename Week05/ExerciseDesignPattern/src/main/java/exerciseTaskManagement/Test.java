/*
 * @ {#} Test.java   1.0     22/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package exerciseTaskManagement;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   22/03/2025
 * @version:    1.0
 */
public class Test {
    public static void main(String[] args) {
        Task task = new Task();

        TeamMember john = new TeamMember("John");
        TeamMember emma = new TeamMember("Emma");
        TeamMember mike = new TeamMember("Mike");

        task.register(john);
        task.register(emma);
        task.register(mike);

        System.out.println("\nCập nhật trạng thái công việc lần 1:");
        task.updateStatus("Đang thực hiện");

        System.out.println("\nCập nhật trạng thái công việc lần 2:");
        task.updateStatus("Hoàn thành");

        System.out.println("\nXóa Emma khỏi danh sách nhận thông báo...");
        task.unregister(emma);

        System.out.println("\nCập nhật trạng thái công việc lần 3:");
        task.updateStatus("Đã bàn giao");
    }
}
