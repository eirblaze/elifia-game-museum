//////////////////////////////////////////////////////////////////////////////////////
//fly2.java - �܂����R���X�g���N�V�����ɂ�����X�g�[���[�\���y�шړ��V�X�e��
//�t�@�C�����������F�����A������ω�������@�\�����B
//�t�H�[���y�уt�H�[���t�B�[���h���́A���ꂵ�Ȃ���΂Ȃ�Ȃ��B
//�܂��AHTML��ł́A���ׂĂ��t�H�[���ň͂܂Ȃ���΁ANetscape�œ��삵�Ȃ��Ă��܂��B
//����m�F�u���E�U�FInternetExplore6, Netscape7.1
//
//�����֐�����
//
//legend(sel,ms2)
//�C���f�b�N�X�Ŋe�}�b�v�̃X�g�[���[��\������B
//�������F�v���_�E�����j���[���瑗����l
//�������F���b�Z�[�W��\��������ڕW�t�H�[���t�B�[���h
//
//daihiru(id,stage)
//�X�g�[���[�����񂻂̂��̂�Ԃ��B
//�������F���s���@�̎w��ł���B��ނȂ����̐������g�p�����B
//	id=1��index.html�Aid=2��stageXX.html�ł̉��s�ƂȂ�B
//�������F�X�e�[�W�ԍ��B���̒l�ɂ���āA�Ԃ镶���񂪕ς��B
//	������^�̃X�e�[�W�ԍ���n���K�v������B
//////////////////////////////////////////////////////////////////////////////////////

string = document.URL;
p = string.slice(-7);
q = p.match(/[0-9][0-9]/);

if (q != null) {
	r = parseFloat(q);

	document.open();
	document.write(daihitu(2,r));
	document.close();
	}

function legend(sel,ms2)
{
	n = sel.options[sel.selectedIndex].value;
	r = parseFloat(n);
document.go.ms2.value = (daihitu(1,r));	/*go:�t�H�[���� ms2:�t�H�[���t�B�[���h��*/
}

function daihitu(id,stage) {
	if (id == 1) 
		kai = "\n";
	else
		kai = "<BR>\n";

	switch (stage) {
	case 99 : writer=('�X�e�[�W��I�ԂƁA�����ɃX�g�[���[���\������܂��B'); break;
	/* �ȉ��A�g���̈�
	case 0 : writer=('�@�A'+
		''+
		''+
		'' + kai );
		break;
	case 1 : writer='1��';break;
	case 2 : writer='2��';break;
	case 3 : writer='3��';break;
	case 4 : writer=('4');break;
	case 5 : writer=('5');break;
	case 6 : writer='6��';break;
	case 7 : writer='7��';break;
	case 8 : writer='8��';break;
	case 9 : writer='9-1';break;
	case 10 : writer='9-2';break;
	case 11 : writer='9-3';break;
	case 12 : writer='10-1';break;
	case 13 : writer='10-2';break;
	case 14 : writer='10-3';break;
	*/
	default : writer=('�H�H�H' + kai );
	}
	return writer;
}
