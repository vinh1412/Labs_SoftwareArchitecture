/*
 * @ {#} Test.java   1.0     22/03/2025
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
public class Test {
    public static void main(String[] args) {
        // Tạo Adapter
        DataAdapter adapter = new XMLJSONAdapter();

        // XML Service
        XMLService xmlService = new XMLService();
        String xmlData = xmlService.getXMLData();
        System.out.println("XML Data from XMLService: \n" + xmlData);

        // Chuyển đổi XML -> JSON
        String jsonData = adapter.convertToJSON(xmlData);
        System.out.println("\nConverted JSON Data: \n" + jsonData);

        // JSON Service
        JSONService jsonService = new JSONService();
        String newJsonData = jsonService.getJSONData();
        System.out.println("\nJSON Data from JSONService: \n" + newJsonData);

        // Chuyển đổi JSON -> XML
        String newXmlData = adapter.convertToXML(newJsonData);
        System.out.println("\nConverted XML Data: \n" + newXmlData);
    }
}
