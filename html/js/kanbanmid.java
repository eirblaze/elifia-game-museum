//ID�ǂݍ���
var q = "";
var nam = "";
nagasa = document.embeds.length;

for (i = 1; i <= nagasa ; i++) {
	nam = ("kbnn"+i);
	q = document.embeds[nam].src;
}
id = parseFloat(q);


//��������
document.open();
document.write(ka(id));
document.close();

//HTML����
function ka(id) {
kan = (
	'<TABLE BORDER="0" CELLSPACING="0" CELLPADDING="0" WIDTH="210" HEIGHT="31">\n'+
	'<TR>\n'+
	'<TD WIDTH="12" HEIGHT="31"><IMG SRC="../img/bl1.gif" WIDTH="12" HEIGHT="31" name="gmm'+
	gmid(id)+'"></TD>\n'+
	'<TD VALIGN="MIDDLE" WIDTH="200" HEIGHT="31" BACKGROUND="../img/b.gif"\n'+
	'NOWRAP>�@�@'+title(id)+'</A></TD>\n'+
	'<TD WIDTH="7" HEIGHT="31"><IMG SRC="../img/br.gif" WIDTH="7" HEIGHT="31"></TD>\n'+
	'</TR>\n'+
	'</table>\n');
	return kan;
}

//�^�C�g��
function title(id) {
	switch(id) {
	case 1 : t = ('�[���_�̓`��');break;
	case 2 : t = ('�t�@�C�A�[�G���u����');break;
	case 3 : t = ('�ςȉ��y');break;
	default : t = ('???');
	}
	return t;
}

//�d�C�̃X�C�b�`
function gmid(id)
{
	switch(id) {
	case 1 : doc = ("a");break;
	case 2 : doc = ("b");break;
	case 3 : doc = ("c");break;
	default : doc = ("z");
	}
	return doc;
}
