package PatternsBahavioral.LearningCommand.commands;

import PatternsBahavioral.LearningCommand.editor.Editor;

//  Copiar texto selecionado para a área de transferência
public class CopyCommand extends Command {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
