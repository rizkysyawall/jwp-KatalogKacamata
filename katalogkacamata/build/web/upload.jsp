<%-- 
    Document   : upload
    Created on : 16-Dec-2017, 16:33:14
    Author     : rizky
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
        <div>
            <h3> Choose File to Upload in Server </h3>
            <form action="test" method="post" enctype="multipart/form-data">
                <input type="file" name="file" />
                <input type="submit" value="upload" />
            </form>          
        </div>
</html>
