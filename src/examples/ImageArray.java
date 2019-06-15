package examples;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class ImageArray {

	public static void main(String[] args) {

		ImageViewer imageViewer = new ImageViewer("Amongst The Tales Of Life.jpeg");

		int[][][] imageAsArray = convertToArray(imageViewer.getImage());

		int method = JOptionPane.showOptionDialog(null, "Choose a method:", "Color Transformation", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Red", "B&W" }, null);

		// 1. Print the RGB value for each pixel in the image.
		if (method == 0) {

			for (int[][] xy : imageAsArray) {
				for (int[] pix : xy) {
					System.out.println("RGB = " + Arrays.toString(pix));
				}
			}

			for (int[][] xy : imageAsArray) {
				for (int[] pix : xy) {
					pix[1] = 0;
					pix[2] = 0;
				}
			}
			imageViewer.setImage(convertToImage(imageAsArray));

			imageViewer.show();

		}

		// 3. Convert to black & white.
		else {

			for (int[][] xy : imageAsArray) {
				for (int[] pix : xy) {
					pix[1] = 0;
					pix[2] = 0;
				}
			}
			for (int[][] xy : imageAsArray) {
				for (int[] pix : xy) {
					pix[2] = pix[1] = pix[0];
					if (pix[2] > 128) {
						pix[2] = pix[1] = pix[0] = 255;
					} else {
						pix[2] = pix[1] = pix[0] = 0;
					}
				}

				imageViewer.setImage(convertToImage(imageAsArray));

				imageViewer.show();
			}
		}
	}

	// [optional] Post a manipulated photo of yourself to Slack.
	private static int[][][] convertToArray(BufferedImage image) {
		int[][][] imageAsArray = new int[image.getWidth()][image.getHeight()][3];

		for (int i = 0; i < image.getWidth(); i++) {
			for (int j = 0; j < image.getHeight(); j++) {
				Color pixelColor = new Color(image.getRGB(i, j));
				imageAsArray[i][j][0] = pixelColor.getRed();
				imageAsArray[i][j][1] = 0;
				imageAsArray[i][j][2] = 0;
			}
		}
		return imageAsArray;

	}

	private static BufferedImage convertToImage(int[][][] imageAsArray) {

		BufferedImage buff = new BufferedImage(imageAsArray.length, imageAsArray[0].length, BufferedImage.TYPE_INT_RGB);
		for (int x = 0; x < imageAsArray.length; x++) {
			for (int y = 0; y < imageAsArray[0].length; y++) {
				Color color = new Color(imageAsArray[x][y][0], imageAsArray[x][y][1], imageAsArray[x][y][2]);
				int rgb = color.getRGB();
				buff.setRGB(x, y, rgb);
			}
		}
		return buff;
	}
}