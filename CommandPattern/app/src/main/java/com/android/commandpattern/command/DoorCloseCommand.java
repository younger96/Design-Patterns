package com.android.commandpattern.command;

/**
 * Description: #TODO
 *
 * @author Shawn(zhao_zepeng@hotmail.com)
 * @since 2016-08-14
 */
public class DoorCloseCommand implements Command{

    public Door door;

    public DoorCloseCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.doorClose();
    }
}
