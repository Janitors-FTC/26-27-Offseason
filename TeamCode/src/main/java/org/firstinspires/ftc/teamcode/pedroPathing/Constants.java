package org.firstinspires.ftc.teamcode.pedroPathing;
import static org.firstinspires.ftc.teamcode.config.RobotConstants.*;


//basic constants rn based on 23511

import com.pedropathing.follower.Follower;
import com.pedropathing.follower.FollowerConstants;
import com.pedropathing.ftc.FollowerBuilder;
import com.pedropathing.ftc.drivetrains.SwerveConstants;
import com.pedropathing.paths.PathConstraints;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Constants {
    public static FollowerConstants followerConstants = new FollowerConstants()
        .mass(robotMass);
    public static PathConstraints pathConstraints = new PathConstraints(0.99, 100, 1, 1);

    public static SwerveConstants swerveConstants = new SwerveConstants()
            .maxPower(maxDrivePower); //determines the max power of the drivetrain
    //      .zeroPowerBehavior(SwerveConstants.ZeroPowerBehavior.IGNORE_ANGLE_CHANGES)
    //the above disables x locking for swerve, which can be useful for tuning pod offsets

    public static Follower createFollower(HardwareMap hardwareMap) {
        return new FollowerBuilder(followerConstants, hardwareMap)
                .pathConstraints(pathConstraints)
                .build();
    }
}
