package com.lcq.designpatterns.action.command;

/**
 * @ClassName: Julia
 * @Description: 客户端角色，有朱莉小女孩扮演
 * @Author: lichaoqian
 * @Date: 2020/8/19 15:52
 * @Version: 1.0
 **/
public class Julia {
    public static void main(String[] args) {
        // 创建接收者对象
        AudioPlayer audioPlayer = new AudioPlayer();
        // 创建命令对象
        Command playCommand = new PlayCommand(audioPlayer);
        Command rewindCommand = new RewindCommand(audioPlayer);
        Command stopCommand = new StopCommand(audioPlayer);

        // 创建请求对象
        Keypad keypad = new Keypad();
        keypad.setPlayCommand(playCommand);
        keypad.setRewindCommand(rewindCommand);
        keypad.setStopCommand(stopCommand);

        // 测试
        keypad.play();
        keypad.rewind();
        keypad.stop();
        keypad.play();
        keypad.stop();

        // 宏命令
        MacroCommand marco = new MacroAudioCommand();
        marco.add(playCommand);
        marco.add(rewindCommand);
        marco.add(stopCommand);
        marco.execute();
    }
}
