package com.edge.util.fileMovement;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

public class Main {
	public static void main(String[] args) throws IOException{
		new Main().copy();
	}

	public void copy() throws IOException{
		// System.out.println("Enter source directory");
		// String source=new Scanner(System.in).next();
		String source = "C:\\Users\\edge\\Desktop\\AWS\\Big";
		File sourceDir = new File(source);
		// System.out.println("Enter target directory");
		// String target=new Scanner(System.in).next();
		String target = "C:\\Users\\edge\\Desktop\\AWS\\target2";
		String folders[] = sourceDir.list();
		File chilDir;
		for(int i = 0;i < folders.length;i++){
			 //for(int i = 0;i < 5;i++){
			chilDir = new File(sourceDir + "\\" + folders[i]);
			if(chilDir.isDirectory()){
				String files[] = chilDir.list();
				for(int j = 0;j < files.length;j++){
					
					
					
					String folderNumber = "";
					String folderName = "";
					String fileNumber = "";
					String fileName = "";
					
					int index = folders[i].indexOf(".");
					if(index != -1){
						folderNumber = folders[i].substring(0, index);
						if(folderNumber.length() == 1) folderNumber = "0" + folderNumber;
						folderName = folders[i].substring(index );
					}index = files[j].indexOf(".");
					if(index != -1){
						fileNumber = files[j].substring(0, index);
						if(fileNumber.length() == 1) fileNumber = "0" + fileNumber;
						fileName = files[j].substring(index );
					}
					
					
					String sourceFile = chilDir.toString() + "\\" + files[j];
					// String targetFile=target+"\\"+ folders[i]+"_"+ files[j];
					//String targetFile = target + "\\" + folderNumber + fileNumber + "_" + folderName.trim() + "_" + fileName.trim();
					String targetFile = target + "\\" + folderNumber + folderName.trim() +"\\"+ folderNumber + fileNumber  + fileName.trim();
					System.out.println(sourceFile);
					System.out.println(targetFile);
					index = files[j].indexOf(".srt");
					FileUtils.copyFile(new File(sourceFile), new File(targetFile));
					
				}
			}
		}
	}
}
