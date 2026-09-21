package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.intake;
import frc.robot.subsystems.arm;

public class ScoreCommand extends Command{

    private final intake intakeMotor;
    private final arm armMotor;

    public ScoreCommand(intake intake, arm arm) {
        this.intakeMotor = intake;
        this.armMotor = arm;

        addRequirements(intake, arm);
    }

    @Override
    public void initialize() {
        // What are the command prerequesites
    }

    @Override
    public void execute() {
        // What should happen repeatdly...?
    }

    @Override
    public boolean isFinished() {
        // When should happen to make the command stop...?
        return false;
    }

    @Override
    public void end(boolean interrupted) {
        // What should happen when command ends...?
    }
}