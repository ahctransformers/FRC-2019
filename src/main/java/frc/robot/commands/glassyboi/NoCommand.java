
package frc.robot.commands.glassyboi;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class NoCommand extends Command {

    public NoCommand() {
        requires(Robot.m_GlassyBoi);
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
    }

}