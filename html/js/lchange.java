/* �X�e�[�W�^�C�g����Ԃ��֐� */
function sname(no) {
	switch(no) {
	case 0 : nam  = ('�킢�̏���');break;
	case 1 : nam  = ('�����R');break;
	case 2 : nam  = ('���̐������߂�');break;
	case 3 : nam  = ('�鍑�R�P��');break;
	case 4 : nam  = ('����');break;
	case 5 : nam  = ('����ꂽ�s�s');break;
	case 6 : nam  = ('�~�̋�̉���');break;
	case 7 : nam  = ('�r���̐킢');break;
	case 8 : nam  = ('�鍑�R�̍Ŋ�');break;
	case 9 : nam  = ('�j��ň��̎s�X��');break;
	case 10 : nam = ('�v�ǂƂȂ����X');break;
	case 11 : nam = ('�߂��݂͎����z����');break;
	case 12 : nam = ('�Ñ㕶���̗�');break;
	case 13 : nam = ('�s�����j�ގ҂���');break;
	case 14 : nam = ('���͐�');break;
	case 15 : nam = ('�����ł̌�������');break;
	case 16 : nam = ('�₽���͂̌��A�M����]�̌�');break;
	default : nam = ('�H�H�H');break;
	}
	return nam;
}

/* �X�e�[�W�ړ��{�^���摜�`�F���W���[ */
Image1 = new Image();
Image1.src = "../img/clpba.gif";
Image2 = new Image();
Image2.src = "../img/clpea.gif";
Image3 = new Image();
Image3.src = "../img/clpna.gif";

function SetImage(Img, Image) {
	Img.src = Image;
}


/* �ړ��V�X�e�� */
function idou(n) {
	NEXT = 2;
	BACK = 1;

	string = document.URL;
	p = string.slice(-7);
	q = p.match(/[0-9][0-9]/);
	r = string.slice(-12,-7);

/* �f�o�b�O��p 
	alert(q);
	alert(r);
*/

	noc = parseFloat(q);

	if (n==BACK)
		idousaki = noc - 1;
	else
		idousaki = noc + 1;
	if (idousaki < 10)
		idousaki = "0"+idousaki;
	location.href = r+idousaki+".html";
}

/* �X�e�[�^�X�o�[ */
string = document.URL;
p = string.slice(-7);
q = p.match(/[0-9][0-9]/);

if (q != null)
	window.self.status = 'M.S.O. : Mission achievement Service agent Organization';
else if (p = 'ai.html')
	window.self.status = '�����Q�[��������';

function sber(a) {
	switch(a) {
		case 0 : window.self.status = 'M.S.O. : Mission achievement Service agent Organization';break;
		case 1 : window.self.status = '�O�̖ʂɖ߂�';break;
		case 2 : window.self.status = '���̖ʂɐi��';break;
		case 3 : window.self.status = '�Q�[������߂ăg�b�v��';break;
		default : window.self.status = '?';
		}
	return true;
	}
