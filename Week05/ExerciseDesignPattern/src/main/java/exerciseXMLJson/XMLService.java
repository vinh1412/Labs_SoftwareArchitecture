/*
 * @ {#} XMLService.java   1.0     22/03/2025
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
class XMLService {
    public String getXMLData() {
        return "<user><name>John Doe</name><age>30</age></user>";
    }

    public void processXML(String xmlData) {
        System.out.println("Processing XML Data: " + xmlData);
    }
}
