package islab.edu.gestionEtudiant;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import islab.edu.gestionEtudiant.ChartApplication.StageReadyEvent;
import javafx.stage.Stage;


@Component
public class StageInitializer implements ApplicationListener<StageReadyEvent> {

	@Override
	public void onApplicationEvent(StageReadyEvent event) {
		
		
		Stage stage= event.getStage();
		stage.show();
		
	}

}
