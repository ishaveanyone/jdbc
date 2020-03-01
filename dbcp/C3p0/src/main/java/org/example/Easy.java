/**
 * Company: 上海数慧系统技术有限公司
 * Department: 数据中心
 * Date: 2020-02-26 14:38
 * Author: xupp
 * Email: xupp@dist.com.cn
 * Desc：
 */

package org.example;

import java.io.*;

public class Easy {

    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("H:/easy.txt");
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        FileWriter fileWriter=new FileWriter("H:/easy2.txt");
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);

        String line ="";
        while ((line=bufferedReader.readLine())!=null&&line!=""){
            line+="<br>";
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            line="";
        }
    }
}
