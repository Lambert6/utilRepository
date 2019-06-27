package swing;

import javax.swing.JFrame;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;

public class photo {
	public static void main(String[] args) throws InterruptedException {

		Webcam webcam = Webcam.getDefault();

		webcam.setViewSize(WebcamResolution.VGA.getSize());

		WebcamPanel panel = new WebcamPanel(webcam);

//		panel.setFPSDisplayed(true);
// 
//		panel.setDisplayDebugInfo(true);
// 
//		panel.setImageSizeDisplayed(true);
// 
//		panel.setMirrored(true);

		JFrame window = new JFrame("��ȡ����ͷ");

		window.add(panel);

		window.setResizable(true);

		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		window.pack();

		window.setVisible(true);

	}

}
