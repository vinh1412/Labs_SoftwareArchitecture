/*
 * @ {#} JSONService.java   1.0     22/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package exerciseXMLJson;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   22/03/2025
 * @version:    1.0
 */
class JSONService {
    public String getJSONData() {
        return "{ \"user\": { \"name\": \"John Doe\", \"age\": 30 } }";
    }

    public void processJSON(String jsonData) {
        System.out.println("Processing JSON Data: " + jsonData);
    }
}
