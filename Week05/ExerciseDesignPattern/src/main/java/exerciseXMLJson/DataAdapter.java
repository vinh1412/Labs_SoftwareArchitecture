/*
 * @ {#} DataAdapter.java   1.0     22/03/2025
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
interface DataAdapter {
    String convertToJSON(String xmlData);
    String convertToXML(String jsonData);
}
