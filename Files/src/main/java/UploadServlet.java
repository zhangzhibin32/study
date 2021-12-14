import jxl.Cell;
import jxl.Sheet;
import jxl.read.biff.BiffException;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import jxl.Workbook;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;

@WebServlet("/UploadServlet")
public class UploadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DiskFileItemFactory factory=new DiskFileItemFactory();
        ServletFileUpload upload=new ServletFileUpload(factory);
        request.setCharacterEncoding("utf-8");
        Workbook workbook=null;
        try {
            List<FileItem> list=upload.parseRequest(request);
            for (FileItem fileItem:list){
                System.out.println("fieldName:"+fileItem.getFieldName());
                System.out.println("name:"+fileItem.getName());
                System.out.println("string:"+fileItem.getString("utf-8"));
                System.out.println("contentType:"+fileItem.getContentType());
                System.out.println("size:"+fileItem.getSize()+"byte");
                System.out.println("isFieldForm:"+fileItem.isFormField());
                System.out.println("inputStream:"+ org.apache.commons.io.IOUtils.toString(fileItem.getInputStream()));
                System.out.println("*************");

                for (FileItem item : list) {
                    if (item.isFormField()) {
                        System.out.println(item.getFieldName());
                        System.out.println(item.getString());
                    } else {
                        System.out.println(item.getFieldName());
                         workbook = Workbook.getWorkbook(item.getInputStream());
                    }
                }

                 Sheet[] sheetNum = workbook.getSheets();
                System.out.println("打印sheet的個數："+sheetNum.length);
                Sheet sheet = workbook.getSheet(0);
                Cell cell = null;

                int columnCount = sheet.getColumns();
                int rowCount = sheet.getRows();
                for (int i = 0; i < rowCount; i++) {
                    for (int j = 0; j < columnCount; j++) {
                        cell = sheet.getCell(j, i);
                        System.out.print("wqe"+cell.getContents());
                    }
                    System.out.println(" \n");
                }
                 workbook.close();
            }
        } catch (FileUploadException e) {
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        }



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);

    }
}
