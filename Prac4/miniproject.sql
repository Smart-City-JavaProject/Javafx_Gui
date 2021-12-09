PGDMP     "    "        	        y            gui_prap    12.9    12.9 %    Q           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            R           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            S           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            T           1262    16501    gui_prap    DATABASE     �   CREATE DATABASE gui_prap WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'English_India.1252' LC_CTYPE = 'English_India.1252';
    DROP DATABASE gui_prap;
                postgres    false            �            1259    16502    accomodation    TABLE       CREATE TABLE public.accomodation (
    acc_name text,
    acc_address text,
    acc_cno text,
    acc_rating double precision,
    acc_roomtype text,
    acc_cost text,
    acc_type text,
    acc_locality text,
    acc_id integer NOT NULL,
    sector character(5)
);
     DROP TABLE public.accomodation;
       public         heap    postgres    false            �            1259    16508    banks    TABLE     �   CREATE TABLE public.banks (
    b_id integer NOT NULL,
    b_name text,
    b_address text,
    b_locality text,
    b_cno text,
    sector character(5)
);
    DROP TABLE public.banks;
       public         heap    postgres    false            �            1259    16514    bus    TABLE     T   CREATE TABLE public.bus (
    b_no text NOT NULL,
    b_dep text,
    b_arr text
);
    DROP TABLE public.bus;
       public         heap    postgres    false            �            1259    16520    cinema    TABLE     �   CREATE TABLE public.cinema (
    cin_id integer NOT NULL,
    cin_name text,
    cin_address text,
    cin_cno text,
    cin_web text,
    cin_locality text,
    sector character(5)
);
    DROP TABLE public.cinema;
       public         heap    postgres    false            �            1259    16526 	   education    TABLE     �   CREATE TABLE public.education (
    e_name text,
    e_address text,
    e_cno text,
    e_type text,
    e_board text,
    e_stream text,
    e_locality text,
    e_id integer NOT NULL,
    sector character(5)
);
    DROP TABLE public.education;
       public         heap    postgres    false            �            1259    16532    flight    TABLE     �   CREATE TABLE public.flight (
    fl_airline text,
    fl_no text NOT NULL,
    fl_dep text,
    fl_arr text,
    fl_deptime text,
    fl_arrtime text
);
    DROP TABLE public.flight;
       public         heap    postgres    false            �            1259    16538    hospital    TABLE     �   CREATE TABLE public.hospital (
    h_name text,
    h_address text,
    h_cno text,
    h_locality text,
    h_id integer NOT NULL,
    sector character(5)
);
    DROP TABLE public.hospital;
       public         heap    postgres    false            �            1259    16544    mall    TABLE     �   CREATE TABLE public.mall (
    m_id integer NOT NULL,
    m_name text,
    m_address text,
    m_time text,
    m_locality text,
    sector character(5)
);
    DROP TABLE public.mall;
       public         heap    postgres    false            �            1259    16550    police_station    TABLE     �   CREATE TABLE public.police_station (
    ps_name text,
    ps_address text,
    ps_cno text,
    ps_locality text,
    ps_id integer NOT NULL,
    sector character(5)
);
 "   DROP TABLE public.police_station;
       public         heap    postgres    false            �            1259    16556 
   restaurant    TABLE     �   CREATE TABLE public.restaurant (
    res_id integer NOT NULL,
    res_name text,
    res_address text,
    res_cno text,
    res_rating double precision,
    res_type text,
    res_locality text,
    sector character(5)
);
    DROP TABLE public.restaurant;
       public         heap    postgres    false            �            1259    16562    train    TABLE     r   CREATE TABLE public.train (
    tr_tno integer NOT NULL,
    tr_deptime text,
    tr_dep text,
    tr_arr text
);
    DROP TABLE public.train;
       public         heap    postgres    false            D          0    16502    accomodation 
   TABLE DATA           �   COPY public.accomodation (acc_name, acc_address, acc_cno, acc_rating, acc_roomtype, acc_cost, acc_type, acc_locality, acc_id, sector) FROM stdin;
    public          postgres    false    202   �(       E          0    16508    banks 
   TABLE DATA           S   COPY public.banks (b_id, b_name, b_address, b_locality, b_cno, sector) FROM stdin;
    public          postgres    false    203   �,       F          0    16514    bus 
   TABLE DATA           1   COPY public.bus (b_no, b_dep, b_arr) FROM stdin;
    public          postgres    false    204   ;0       G          0    16520    cinema 
   TABLE DATA           g   COPY public.cinema (cin_id, cin_name, cin_address, cin_cno, cin_web, cin_locality, sector) FROM stdin;
    public          postgres    false    205   81       H          0    16526 	   education 
   TABLE DATA           r   COPY public.education (e_name, e_address, e_cno, e_type, e_board, e_stream, e_locality, e_id, sector) FROM stdin;
    public          postgres    false    206   3       I          0    16532    flight 
   TABLE DATA           [   COPY public.flight (fl_airline, fl_no, fl_dep, fl_arr, fl_deptime, fl_arrtime) FROM stdin;
    public          postgres    false    207   :       J          0    16538    hospital 
   TABLE DATA           V   COPY public.hospital (h_name, h_address, h_cno, h_locality, h_id, sector) FROM stdin;
    public          postgres    false    208   �<       K          0    16544    mall 
   TABLE DATA           S   COPY public.mall (m_id, m_name, m_address, m_time, m_locality, sector) FROM stdin;
    public          postgres    false    209   �?       L          0    16550    police_station 
   TABLE DATA           a   COPY public.police_station (ps_name, ps_address, ps_cno, ps_locality, ps_id, sector) FROM stdin;
    public          postgres    false    210   [A       M          0    16556 
   restaurant 
   TABLE DATA           x   COPY public.restaurant (res_id, res_name, res_address, res_cno, res_rating, res_type, res_locality, sector) FROM stdin;
    public          postgres    false    211   �C       N          0    16562    train 
   TABLE DATA           C   COPY public.train (tr_tno, tr_deptime, tr_dep, tr_arr) FROM stdin;
    public          postgres    false    212   �H       �
           2606    16569    accomodation accomodation_pkey 
   CONSTRAINT     `   ALTER TABLE ONLY public.accomodation
    ADD CONSTRAINT accomodation_pkey PRIMARY KEY (acc_id);
 H   ALTER TABLE ONLY public.accomodation DROP CONSTRAINT accomodation_pkey;
       public            postgres    false    202            �
           2606    16571    banks banks_pkey 
   CONSTRAINT     P   ALTER TABLE ONLY public.banks
    ADD CONSTRAINT banks_pkey PRIMARY KEY (b_id);
 :   ALTER TABLE ONLY public.banks DROP CONSTRAINT banks_pkey;
       public            postgres    false    203            �
           2606    16573    bus bus_pkey 
   CONSTRAINT     L   ALTER TABLE ONLY public.bus
    ADD CONSTRAINT bus_pkey PRIMARY KEY (b_no);
 6   ALTER TABLE ONLY public.bus DROP CONSTRAINT bus_pkey;
       public            postgres    false    204            �
           2606    16575    cinema cinemas_pkey 
   CONSTRAINT     U   ALTER TABLE ONLY public.cinema
    ADD CONSTRAINT cinemas_pkey PRIMARY KEY (cin_id);
 =   ALTER TABLE ONLY public.cinema DROP CONSTRAINT cinemas_pkey;
       public            postgres    false    205            �
           2606    16577    education education_pkey 
   CONSTRAINT     X   ALTER TABLE ONLY public.education
    ADD CONSTRAINT education_pkey PRIMARY KEY (e_id);
 B   ALTER TABLE ONLY public.education DROP CONSTRAINT education_pkey;
       public            postgres    false    206            �
           2606    16579    flight flight_pkey 
   CONSTRAINT     S   ALTER TABLE ONLY public.flight
    ADD CONSTRAINT flight_pkey PRIMARY KEY (fl_no);
 <   ALTER TABLE ONLY public.flight DROP CONSTRAINT flight_pkey;
       public            postgres    false    207            �
           2606    16581    hospital hospital_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.hospital
    ADD CONSTRAINT hospital_pkey PRIMARY KEY (h_id);
 @   ALTER TABLE ONLY public.hospital DROP CONSTRAINT hospital_pkey;
       public            postgres    false    208            �
           2606    16583    mall mall_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.mall
    ADD CONSTRAINT mall_pkey PRIMARY KEY (m_id);
 8   ALTER TABLE ONLY public.mall DROP CONSTRAINT mall_pkey;
       public            postgres    false    209            �
           2606    16585 "   police_station police_station_pkey 
   CONSTRAINT     c   ALTER TABLE ONLY public.police_station
    ADD CONSTRAINT police_station_pkey PRIMARY KEY (ps_id);
 L   ALTER TABLE ONLY public.police_station DROP CONSTRAINT police_station_pkey;
       public            postgres    false    210            �
           2606    16587    restaurant restaurant_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.restaurant
    ADD CONSTRAINT restaurant_pkey PRIMARY KEY (res_id);
 D   ALTER TABLE ONLY public.restaurant DROP CONSTRAINT restaurant_pkey;
       public            postgres    false    211            �
           2606    16589    train train_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.train
    ADD CONSTRAINT train_pkey PRIMARY KEY (tr_tno);
 :   ALTER TABLE ONLY public.train DROP CONSTRAINT train_pkey;
       public            postgres    false    212            D   �  x����R�6���S��vj�e[v|�B;�lJ<��Lo�X�5(VF�(�˾U_�O�#;�C	���D�����o��-WP8%��B�(=�`.�V������� ��Q�ĭ\0�8�7�5F4$?�4�2є��$F�n-��y�^ᤇ?��R���������D-s'� ���w�!�~�R�JZy{9���8)*3nZ��"�T��T�W������0���%\���M�0Li�2��^R2���=9��ZWJsY�+�C��t�c{��P�i%��Ŕ�?��i����������켛)ma�I
���=�P�!�4JsJ)��e꒛��/Ob�|�{�9wD�K��P�Z��&�ю�!BQ�5�j��S�"�]�.Җ.'c�7�D� ��?"����ʼ��ö�c�-Lt�Ͳ"W�O������F���P��Oi _�}�1�V���ܕ=����k^򷹲�y�,�4��;�Tg�wʓDIғL�q�0B��4|��V��Kɒo�l4�˳�~���/u�6�x�GFp�
��pf�]9)����z #�x��8U���{�>��0�H��W��e�yP�m����Mxȅ�<��K����.ɾl,�E��W�r�{cS;�`�ʲ��k�_�u ���OYw(}2�_���.�Ľ��s_h���y�<q�T��������tR�@���_�ƹt���7��!A)(�J�Vδ�m�6�Jnu�j��s
h�n���h���D��N����Y��i�����p[Ia�=�r���;Hc�\(d�9��KNh���G���?���C 'o_ga�G��_Z�v�=;���9�W��g=���(*#D��=Z�������l�y��F��Q�᷋<�B�a�0���F������}�w�l������_1]�{��.�T%���Y����5�>஍��+�V�&��n�I7�Jk��d!n7�������3n_r8p�WRm�]�v4�>`ŗ�ȳ�1899��6      E   m  x���K��6���_qW���ǒ-��L��!]�L6و���6e��ȯϕ�����
/��;��\ɔ����0�	~��t�Y��L�J(�5U��V�QI���J>ZS@����(6��`!�̫�Z(���2�����������2���8� 
I��b�cODaRArcaa���o<0��5̄����?��*`�E����!��N@@ng_��7ɜ��Ѕ*3-`)K�J��v�� ���D��A�1��1�Q�ͫ*khW0����<�Z�j��;UȾ^�/�7��s,�rG�de��M����Bm%��p�&���!2�e��6n�%uyXbk�BmDz���~���cθ���L�oC��g�S=:ixb^$�Ƀ$�>@s��|ɋ���E`謆�.��#*s����t2~:�G4$��ZŖ�����2>���*!��V��+�� �]�!�0�Q��hM��xW�uT�-�,�ަ�_�R�[ױ�)>[���m������X�C���4OVu*>8ߑ��0����,���0�º�ZK`��C�#�-��Llײ\����6���v\�X���Z�J�3c�2s���lw�|���C�vX�Û�k�q�,�f��t��0�����[H�'Q
��Ḻ�U�������y	ݕ�&��(���ऎ�5ӑd�@0L��Q�z��û�u�2=��1ƿH�3�E�{���jԛ�n�.��T8|����c3�~���m{�%�QD�����O��
kr��fB4軸|�{Ԙ��[�Fs"r�7�tH��,���pG��nK�g����=1>���I\��F	3�f-�cRkL�rX��i��+?hu����v�?�'�ߪ�B�f驪ƽ���Q���N���WWW��z�u      F   �   x�}�OO�0��Χ���4����K/0	�f����k��*K����F��)~�g?g��#�h�"m>�G(hg�������@e��33< b���N�)zG�͡%(�ϸ�o>N���1��+̖��pW�X��6z,��;�ʵ�w��'�ǊH��PM{�������
d:�#�Z���j���Iv��D���ܺ �kX����ϯ�'0���W�'��0�:��dO�M{��e.��넥.      G   �  x������0���S̽�#)�]�֦$,�fCR�=�2k��@�����G�s��*[�BJI��Ј���g��m�:԰T���%;mlM�Y圖��X]�=j�A�Xx<���g�#�b���T?���C�m�,�`�3J��,��y�SJ*�����b]�0��L���_3N�s��65�G��pp�i`_�b�3I*���z���c�=k�)�g��a��q4Z�>���ޘ���Ŧ��l���7jW��i����
f�g�RM�0 M�D�H����7��su�Rj�[�J������B�ʈҌ.ƌ�����oet��㙌�dA?x�$��z8o�jOV�����P��QbQ�ړI��z�X�)�/'�T���ԉw��)�=�����æ�z��V���J��N�`W�����hӼD��_f��'�Bd��|����٫	K�F�g��/�,      H   �  x��X�r�F]���W�	�~�%��!�e<N�*�6j#��D�a�]�!�/�m���,��,�	u�s��{���NF�:�T�,�#�X�q��_&+��yg�6ƴ���y߽zF��)|���8���x�����S�,�÷�%��|�(��I�&S?K$�(a��_\�s��C��z��B� c�ل�R>�
��(�c|1�(�]��08��pAh�c2>��!V�=�ې0L2�r���"~U�ć�r!�Np9�B�}W;��`�B*�2{���	�e�ͦ3<��P���_כ�
 -E�)N֥r��ҏ�0^�P��� U���W�Tm�\F/*|5�j���P��׈��U)��
�]g���h��x*#χ��4� +B�n=��Om�u�u�A���}_��$*M�r�ɰ��$7�ҊŹE����y�28¥ht�����sO�@娞6��p%��
���xf�K؄�.�F���% �U�ӧd�g����:J�FT��F���0t~W)�˓��t� �i{[@@�)�f
�?��Ǔ�!��6��j�A��c�.L���u�����|�<�ῦ��w�^K��_T
us�[o�8ڙ�GqzBɤO�s����Z���d��8��w������Lb8�(�ڹQi�BÜɤ��.Q����pB��p�z�ΤB�D����p��J.�"�8R�ۻ�܆�Dԗ�*�P����2N�
&�i,�����_���H�"c`�&��#t��&��JnA�)�C�a s�ҡ�^0*N6�j�"^��Q;d��:�_GM���G�o��4�gyn\��C�M*�v�~�b�W���N�a������g��u�!���BY_B�C��OJ��Z��ڢ�x����/�{;�M*pv�ϓG_>(�P��sڿTCe:�d���|/���I@�N�P�� Q0�F���h���q�T=��Z.�M��x��ۍ̲]YҊ;�m��.�� ��i�_��@��C���Y8�w(�,���X��!��;���"��_��V餀;��u��� ��1�PE�1d�8B�p'�w��]�-2�(� PK�jo�l�o�Tm���F�<ɽ-lcZ���>���w���F�f����g�I�ـ<}��6Q%�w�h��An�Sp�a�xb�������:4�B/��E���~;�Y�����/�G�O7�
7gq�os9�)�ı:�5�B2���̳ <£*z���o����1��فvtbiР&?���i����&��W<C��|5���p��X|�)��z����p#��j��u%���,�M��YǇ�6��Z����٩�u�'��4����O�g�$2�}w|2t��s��4��/*Iu귎E��%�1���,*�e���*�\iͷ�9,�:�>F��C��o5i'��R��:���\�I0͂,��+i}�0�'Ƽ�����˗��z (G���d�=�����#���yN�,�&���0a�L��q��J�蕵*���j�Ƅ���~���銵^�@��������;�[���,��u0wKv���yN����fm��pi!�3�W�aHL�r�34�-�g��6j~�_���B�C�;IQ��zy0����/Ma_�Y��M�mF`��@�6T���v�[�׮:�ƈ>ef<��.��8�K��B��k1�lg�N'�4œa}K�_{8L����ߍ5%���M9�u4���]���=�g	&����۞ū�������?w��4      I   �  x�}��r�0���S�	:Zɲln@�P Ӗ�I3�(�b����Wkbaǝ^|�����M��d��9�,)�f��8%����4yJ.��������<��}N`r�+�� ��4
h���A[����l8J��:V��l`s�����#��p1�EB�6�U����Em�/�%�0t]=���_�F6{��1�Ԩl��ᔁl�/��PKJ[�[_tQ�ed�B4�ke�6Ej�\T�KD/�Z��8e΍�ϱ.����׵�O��MRd�kw�*�[���aa#n����xi#F��FF��H����Y��.�^"��"h����z�W�3��:�&�/�����؉o �a� pX��6���d!�k���o-��mܭ�8M���q�n{ώ��΢��֞��T��$�HH�uF�X���{-�*�SV��x�oҧ�A�����;�T~l��q�D��<^w�Qoj���pA��(�Qd����j'�6�_�젲��/!p��1?��d5��	Ƒ�kU[U�hDH�D�O���� 5g���8��,��� hcQ�Wۡ����EP�N3R~XkV�q�؞�}���3��-):]3g��cז�2<*o}���sR��Lw��T�?�D�%���Tiw��3Q����;(��:ZN���z�X����T+��H|BZ����S�e����){��S����O����%��      J   �  x��T]o�0}vŕ�x!�b;��]�tӂ��x�kM��M"'�ȿ���d��Z)M�����{���TOt��e�ԺE�nL���N`t&���r�0�̽\M��B��U�vF�c\iȖ�{�dHk��E�/��ޥ\�A��m�g1�g�c���
˧�S�pp�B�����܃���F�
����9T?�S9�H���8�����S����X[\`�{���(�8��D���}�v��[�U�B;)`���*Ƈ��F���8W��Ⱦ�`�,CZ`�,�s{�a]S=������G���å6n�;>�I��#C���X٥a!��A�cUM�=�����p�{�ט'A�ï�>�QK?�Ʌd�:� q�Ͳ�!���kK߃��b�WcK!�w���g}׷=�)w����Fn���i�s�X����E�!��D�9��_,�:SV���V�Em�s��U��r
Ndo}���i_$��D��.%L�D\�7rC��^�a�a]�3ƅ���;=���M���z		
�{��$R��\/��8�S�0�|&��ʄ~�,���R5ş�28�4$���MK
�3�#��>/��8���mv9g�ӁԾ��^��Rו5���*2��,W����u���Ʋi*|��&7��b3����_.��      K   �  x����N�0���S�d+;Ii9�e+��h��L��x�ؕ��������j#ٲ���/�}1�ֶ��E�ٽ���� ����A\F����:�#�)��iD��F�m]�PE��bX�!��ǂ���4�r�! K��ádC}#�~)﵄'�t~±���6�*����+H¶���\���Ki(���϶���@��d�	D�Z��u��>|��)�8�䧘C�򀙲��n�|���D�T���uu	��Ej$���;Y���:�6��+N��kB���Rj<E�L��	�Y����������~+�ִ�b8�$���J��F�%��؝�	=	Fj�R�nh� �o~B:v!���p��1N_JL�m.���j�!]8��eKX����Sdwt;0Ar��y;/�yAV��TdABj��+�ݮ�e��_���{��$���F�7��a�      L   3  x����n�0��㧘{������F�9�2���,���oߑ,:��,�����E7+�K��*ܣ�yC��J�Z޻��T:���5������<�o��)mN�����	�ի�FJj%��Di��4ұ�t� E�����;�|���q�3���eUo����z�D�T�@�ii��Ƞ��7T�z��(:�n�����?>\8�rk���H�e! ��?;=�S[Ц}U�YQ58�f�@OyͶ�+��/.l�r��b��E�|��%*
�q&u� �Ը��Z��|״�f��ǔ;���|��ȡ�Ѐ8�h.�9;n-޻�x�R:�J��?*c�o(����A��ʸ���=D��+�6Xv]s�rK]��m)xᎃj`9F�����O��02*R9$`��qN�r:d4:I���޹/w�������*b�A)d}sݵ~�:)�G�����y]��˓�����j�ưSA6ؿ�KK���|c}��������KS���-�����N z�Z�]]s.��Ɔ����ͦ�]c�����j-O��B%;���F��_Ѡ�e      M     x����r�6Ư��ثL;5Ē��.��4ғ�No(X���,'���s�ź�Mp
��&!��ow�]��|��d.��>�|=��^
S�u�䪓8p���z��90M��^�"|)�Fi�M�^�#�,�\͸t���5^�Fs�˨K�KhLc�.>�׍�g��v���]����3J�r������O�[�)7������p�?��2Q�D�(��(����ߥ_�����ȍ�sQ^j���i�����R��e0�=�@�\pW+�͎68�6�^�F4b�zGhK�~*qY��H2Q��)3�v��0sha�1SJ�"E'�=/��EUP2�z5�>��Ϲ4V�A>� y��X *��E�gH��2�0x�����'�q�n䆖���E4p#�d�ǽ]��U�C�K�ZI����d�ig�9�.���Be,�����8�r��'2��05\0TFd���b�� ����Q�]7�~}��E���m�"��DdPo�h��Uٟ�O�̗�|-�ߏ? �	���Ҩ]%���[ǡ�N1k��Ӱüm���*�J�$�\3fk�Ԅ �L�%�����b�r��: �� .�@E?R]��o4*����?��&���`Y���J�z)4��dn��������KQ����):h�7}{[�2��ˉ��x̏׭<`��w��W����6��9���'GJݩj���� r��� g\w*�t���hY 0s�V�%abn >{�
(#?��sӴ -7�TX��*uKǃG�?�᫏ z�j�VXhQ�W q�)R�_���@'�LR��5�P�s�p�C���i���6��.��S�c��>��O�諅M*t��¥Qx�>m�Yr�e���|�H}��K���f�)h�\�doH=�4I�y!w����E�YD�ےc��=�,4���ta��Әg+|����|���};�=���#�q�����*$W�]����9��o��OJ{/���m�U�up�Bi1�x�es����.�##���`ǵ����u�$�cہ���3~@��bG����[i�@�1�alͮ��C/47��7�V+8��J���Y�b�@�4o� �mt12G��F��6��O�ZħV��[�������M��Y|)�8v��>N�H3҄\j>���* �svil	.��/�n��en�w3�(2;-��X�����ف��!Fɂ�d��i~��4qu�_C��$�Ha*�^�r!��N�b3w�b������`�xt�mxc7�]m]�v�������      N   �   x�m��
�0�������wso� (��Z� =��M���e�1�����8��ӿ��r�Jf �u�Y?��1>�$�3����ُݳ�����@3��.�b!:�Y��$�]�-F�Ĩʑ�\ ��3�H�Fkd�.u�Kmё����A"���)���4R$HTU_t������op�I)���t�     