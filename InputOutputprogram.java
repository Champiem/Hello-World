Public class example {

Pubic static void main(string[] args)
{
Jframe frame = new Jframe("program");
frame.setVisible(true);
frame.setSize(400, 400);
surface.setResizable(true);
frame.setDefaultCloseOperation(Jframe.EXIT_ON_CLOSE);

Jpanel panel = new Jpanel();
frame.add(panel);
Jbutton button = new Jbutton("menu");
panel.add(button);
button.addActionListener (new Action1());

Jbutton button2 = new Jbutton("Settings");
panel.add(button2);
button.addActionListener (newAction2());
}
}
