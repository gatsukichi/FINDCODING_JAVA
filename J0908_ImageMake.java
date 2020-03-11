package ssk01;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.OutputStream;
import javax.imageio.ImageIO;

public class J0908_ImageMake {
	public static void main(String[] args) throws Exception{
		String str1 = "이미지 파일 만들기";
		BufferedImage image = new BufferedImage(400,400,BufferedImage.TYPE_INT_RGB);
		
		Graphics g = image.getGraphics();
		g.setColor(Color.YELLOW);
		g.fillRect(0, 0, 400, 400);
		g.setColor(Color.RED);
		g.drawString(str1, 150, 200);
		
		OutputStream out = new FileOutputStream("ggg.jpg");
		ImageIO.write(image, "JPG", out);
		out.close();
	}

}
