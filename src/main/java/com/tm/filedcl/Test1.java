package com.tm.filedcl;

import com.tm.filedcl.config.MpGenerator;
import org.junit.Test;

public class Test1 {
    @Test
    public void contextLoads() {
        MpGenerator gse = new MpGenerator();
        //要给那些表生成
        gse.generateByTables(false,"zip_file_dcl", "zip_file_in_20190628");
    }

}
