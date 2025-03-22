/*
 * @ {#} TeamMember.java   1.0     22/03/2025
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
class TeamMember implements TaskObserver {
    private String name;
    private TaskSubject task;

    public TeamMember(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        if (task == null) {
            System.out.println(name + " không có công việc nào để theo dõi.");
            return;
        }
        String newStatus = task.getUpdate(this);
        System.out.println(name + " nhận thông báo: Trạng thái công việc thay đổi thành '" + newStatus + "'");
    }

    @Override
    public void setTaskSubject(TaskSubject subject) {
        this.task = subject;
    }
}
