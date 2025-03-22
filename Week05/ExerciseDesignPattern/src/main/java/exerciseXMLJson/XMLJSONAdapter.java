/*
 * @ {#} XMLJSONAdapter.java   1.0     22/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package exerciseXMLJson;

import org.json.JSONObject;
import org.json.XML;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   22/03/2025
 * @version:    1.0
 */
class XMLJSONAdapter implements DataAdapter {

    @Override
    public String convertToJSON(String xmlData) {
        JSONObject jsonObject = XML.toJSONObject(xmlData);
        return jsonObject.toString(4); // Format JSON đẹp hơn
    }

    @Override
    public String convertToXML(String jsonData) {
        JSONObject jsonObject = new JSONObject(jsonData);
        return XML.toString(jsonObject);
    }
}
