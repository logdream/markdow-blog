package win.log.utils;

import com.alibaba.fastjson.JSON;

import java.io.*;
import java.util.List;

/**
 * Created by surface on 2017/6/23.
 */
public class JsonUtil<T> {


    public T getObjByFile(String filePath, Class<T> c) {
        InputStream in = null;
        File file = new File(filePath);
        if (file.exists()) {
            try {

                in = new FileInputStream(filePath);
                T obj = JSON.parseObject(in, c);
                return obj;
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (null != in)
                    try {
                        in.close();
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
            }
        }
        return null;
    }

    public List<T> getListFromFile(String filePath,Class<T> c){
        InputStream in = null;
        File file = new File(filePath);
        if (file.exists()) {
            try {

                in = new FileInputStream(filePath);
                List<String> strings = org.apache.commons.io.IOUtils.readLines(in);
                List<T> obj = JSON.parseArray(strings.get(0),c);
                return obj;
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (null != in)
                    try {
                        in.close();
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
            }
        }
        return null;
    }

    public boolean writeFile(String filePath, Object obj) {
        OutputStreamWriter writer = null;

        File org = new File(filePath);

        File temp = null;
        if (org.isFile() && org.exists()) {
            temp = new File(filePath+".bak");
            org.renameTo(temp);
        }

        try {
            org.createNewFile();
            writer = new FileWriter(org);
            JSON.writeJSONString(writer, obj);
            return true;

        } catch (Exception e) {
            //如果报错而且有备份就恢复备份
            if (null != temp)
                temp.renameTo(org);
        } finally {
            if (null != writer) {
                try {
                    writer.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }


}
