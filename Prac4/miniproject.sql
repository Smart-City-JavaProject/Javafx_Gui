PGDMP     :                
    y            MiniProject    13.4    13.4     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    49202    MiniProject    DATABASE     i   CREATE DATABASE "MiniProject" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'English_India.1252';
    DROP DATABASE "MiniProject";
                postgres    false            �            1259    49220    accomodation    TABLE     �   CREATE TABLE public.accomodation (
    acc_name text,
    acc_address text,
    acc_cno text,
    acc_rating double precision,
    acc_roomtype text,
    acc_cost text,
    acc_type text,
    acc_locality text,
    acc_id integer NOT NULL
);
     DROP TABLE public.accomodation;
       public         heap    postgres    false            �            1259    73794    banks    TABLE     �   CREATE TABLE public.banks (
    b_id integer NOT NULL,
    b_name text,
    b_address text,
    b_locality text,
    b_cno text
);
    DROP TABLE public.banks;
       public         heap    postgres    false            �            1259    73810    cinema    TABLE     �   CREATE TABLE public.cinema (
    cin_id integer NOT NULL,
    cin_name text,
    cin_address text,
    cin_cno text,
    cin_web text,
    cin_locality text
);
    DROP TABLE public.cinema;
       public         heap    postgres    false            �            1259    49258 	   education    TABLE     �   CREATE TABLE public.education (
    e_name text,
    e_address text,
    e_cno text,
    e_type text,
    e_board text,
    e_stream text,
    e_locality text,
    e_id integer NOT NULL
);
    DROP TABLE public.education;
       public         heap    postgres    false            �            1259    49250    hospital    TABLE     �   CREATE TABLE public.hospital (
    h_name text,
    h_address text,
    h_cno text,
    h_locality text,
    h_id integer NOT NULL
);
    DROP TABLE public.hospital;
       public         heap    postgres    false            �            1259    73818    mall    TABLE     �   CREATE TABLE public.mall (
    m_id integer NOT NULL,
    m_name text,
    m_address text,
    m_time text,
    m_locality text
);
    DROP TABLE public.mall;
       public         heap    postgres    false            �            1259    49242    police_station    TABLE     �   CREATE TABLE public.police_station (
    ps_name text,
    ps_address text,
    ps_cno text,
    ps_locality text,
    ps_id integer NOT NULL
);
 "   DROP TABLE public.police_station;
       public         heap    postgres    false            �            1259    73826 
   restaurant    TABLE     �   CREATE TABLE public.restaurant (
    res_id integer NOT NULL,
    res_name text,
    res_address text,
    res_cno text,
    res_rating double precision,
    res_type text,
    res_locality text
);
    DROP TABLE public.restaurant;
       public         heap    postgres    false            �          0    49220    accomodation 
   TABLE DATA           �   COPY public.accomodation (acc_name, acc_address, acc_cno, acc_rating, acc_roomtype, acc_cost, acc_type, acc_locality, acc_id) FROM stdin;
    public          postgres    false    200   �       �          0    73794    banks 
   TABLE DATA           K   COPY public.banks (b_id, b_name, b_address, b_locality, b_cno) FROM stdin;
    public          postgres    false    204   �"       �          0    73810    cinema 
   TABLE DATA           _   COPY public.cinema (cin_id, cin_name, cin_address, cin_cno, cin_web, cin_locality) FROM stdin;
    public          postgres    false    205   �%       �          0    49258 	   education 
   TABLE DATA           j   COPY public.education (e_name, e_address, e_cno, e_type, e_board, e_stream, e_locality, e_id) FROM stdin;
    public          postgres    false    203   �'       �          0    49250    hospital 
   TABLE DATA           N   COPY public.hospital (h_name, h_address, h_cno, h_locality, h_id) FROM stdin;
    public          postgres    false    202   K.       �          0    73818    mall 
   TABLE DATA           K   COPY public.mall (m_id, m_name, m_address, m_time, m_locality) FROM stdin;
    public          postgres    false    206   �0       �          0    49242    police_station 
   TABLE DATA           Y   COPY public.police_station (ps_name, ps_address, ps_cno, ps_locality, ps_id) FROM stdin;
    public          postgres    false    201   �2       �          0    73826 
   restaurant 
   TABLE DATA           p   COPY public.restaurant (res_id, res_name, res_address, res_cno, res_rating, res_type, res_locality) FROM stdin;
    public          postgres    false    207   �4       E           2606    73776    accomodation accomodation_pkey 
   CONSTRAINT     `   ALTER TABLE ONLY public.accomodation
    ADD CONSTRAINT accomodation_pkey PRIMARY KEY (acc_id);
 H   ALTER TABLE ONLY public.accomodation DROP CONSTRAINT accomodation_pkey;
       public            postgres    false    200            M           2606    73801    banks banks_pkey 
   CONSTRAINT     P   ALTER TABLE ONLY public.banks
    ADD CONSTRAINT banks_pkey PRIMARY KEY (b_id);
 :   ALTER TABLE ONLY public.banks DROP CONSTRAINT banks_pkey;
       public            postgres    false    204            O           2606    73817    cinema cinemas_pkey 
   CONSTRAINT     U   ALTER TABLE ONLY public.cinema
    ADD CONSTRAINT cinemas_pkey PRIMARY KEY (cin_id);
 =   ALTER TABLE ONLY public.cinema DROP CONSTRAINT cinemas_pkey;
       public            postgres    false    205            K           2606    73809    education education_pkey 
   CONSTRAINT     X   ALTER TABLE ONLY public.education
    ADD CONSTRAINT education_pkey PRIMARY KEY (e_id);
 B   ALTER TABLE ONLY public.education DROP CONSTRAINT education_pkey;
       public            postgres    false    203            I           2606    73805    hospital hospital_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.hospital
    ADD CONSTRAINT hospital_pkey PRIMARY KEY (h_id);
 @   ALTER TABLE ONLY public.hospital DROP CONSTRAINT hospital_pkey;
       public            postgres    false    202            Q           2606    73825    mall mall_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.mall
    ADD CONSTRAINT mall_pkey PRIMARY KEY (m_id);
 8   ALTER TABLE ONLY public.mall DROP CONSTRAINT mall_pkey;
       public            postgres    false    206            G           2606    73803 "   police_station police_station_pkey 
   CONSTRAINT     c   ALTER TABLE ONLY public.police_station
    ADD CONSTRAINT police_station_pkey PRIMARY KEY (ps_id);
 L   ALTER TABLE ONLY public.police_station DROP CONSTRAINT police_station_pkey;
       public            postgres    false    201            S           2606    73833    restaurant restaurant_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.restaurant
    ADD CONSTRAINT restaurant_pkey PRIMARY KEY (res_id);
 D   ALTER TABLE ONLY public.restaurant DROP CONSTRAINT restaurant_pkey;
       public            postgres    false    207            �   �  x����n�6���S�� �*��-g��=n,(�mq,"�hPdϲo�����ǒ�8i&BbؔL����C��=��w��LX^tq���m�T;p[P�����ܔk��S�u����q��R�y1�HF�LBkevLq��^�'=�gWҬ���R���������篿�u���[��w�c;+,�z�˳���-�*��9k��72�:0���K&�μI�	:�(��L�ug���شɹ�����c�UrS��w��	�tx��-~��y4�w$�Z�}��Q���R�BN�>A�΁�F^�B,[�L�S�����m�揬s�5��%~��۝u7
�a��&D�YAw�9��N��ѹ�#\:G:�Ԛ	Z�|���ޯBt�Rt`��ݳ5��0�U�º�Xk�T�,�V��Á ������QQ�x�)�>���V��ќ�M�aCǄ�)���8�Ѹ�0xC02,�2�
�mG{���������ZN�pu��ԛe3���M�Uc�T1
��dF���������M`*�(�%r�W*�e����O�$I�#�^)���� ��b'͊l����P��n����K�iSXl��z�[k��ޅ�F�0��j1����0V�f�j�c.��w϶��N���L��C���P>�;u�7���O���m3;!ͮ{�~�u�.��A�~[s������o)y���XLQ-�N��^@d��?,�{��x�x��d��������[ލ�
��3u��9ʬ/E<��ʊ	T��I�7�"ыΞ.���y`zl����cU�^m��n���-{v��4�凯�E�>
�B1�+�Gw:﫬9&��D`���N$����BH}�%^�!&qrlޫ�;���]]`Z�͍��W�Li�=�K�E��c��{��3<�@Մ׍jz��e��,�LUm
"c�)�?���7��j�i:�4xf
�i���T���m�7G����Ķ�s�      �   >  x���Mw�6������n��X²a`f�i�9ඛnD�b5�ı�|̯�ml`�I�p��z��~���CK�a��#����Lro�s	k.��ԕ�[X�)�k k�`M	Q ����'�%�����,8�UnK	)	���ޯB)M�(őO�=u�K�q�^Ksdr����`Υz����c��"8�!e�(b�y7�ϳV�u���KHp�RV���̄~x=O���I��aa|�4a�hB&l��Ȼ~�U�ۋ�����Z�|*v��F�.��,Jd��r+Z�f�d�KYB)���^�hD�~|�z�&c��7�&��[���C�CrrH�#L��޼ʺ�A��	�S�g�Mͳ���ƌ�/�&��l�U�HS�ce5�v�nS�P|W���t>�8V�$�s�4!��$�Ӻ�T���uի�O����c�q�ш>���q�tו-����fG_�H�����1m��Z�zЍ�BA�˧,�V��Fh��H����6~)�Z5�q5�C���P��tmq��b#��cB��G'&cc�`����4��0H���s7"�L�S����_��C���>��� ��<�#�B��W.K^@Z?�f�u��/�.�?�U=���6|e�,��0N|¼&T�՚���#fB����_`W�n[egfӚ^41g���I��-W.c����}�Tʺ���E��(�ɭ� �q���(��ms����]Dv@����U�t�r��ſBns��/�у�7���\q��ɩ�]�aE]���I��?�u��4��FCq�ѷ$��J���6>:��Z�5�DH��~?�n���|�����h      �   �  x���Mn�0���)f_U&i�T]օ���c�A�E7��P�Aђs���+-Z���.� p���y|�,�j٣��ԢŎl�q�1	g1��sJ�wcU��T{Q9c�#��5h_��{	���e�/�3�gRF9��CɊ�QZ%��q��y6�.�UpN*��Ȥqr��	Vʴx��f�w�Ѱ�߀���Y���HG���ÐH�ٚ^��8s����`����{��1u+�����^^��+�3�y�3Z��
��h%u-1�L�QJ�6?`�/�Q	�0��mKe����(�'��������d4�3�U���R��É��Q��$����V���wڢj�����gV�u�X�5�ǣ}n��"�QN�O;x��
mQ�BM/��t�T��>̥��s�0����2�K�h~&d<M��]*?z{U���L�(�W�'�      �   �  x��X�r�F]K_ѫ�D�~聖�=�v�P��T��iK=��B����]�!�/�m��K�"YP���}���{��=��"�y��^ǡ�n�l࣭�8C�1"��b�S�_E�H"��8j�Bw��fa�=��������.f�[�,�2�>ri�%�{<��#�`J���K(��cbۡZ��v���/�[�1��B���Ph@2��?�8�>�	���B�Џ!�,Lj��T��>%�-�c� �O�=H��ଦ��PfYN/�L���=����0Z��=Q�0���)����(K_��-���a�V��/Sa�����`�b63���V�H�o�0Z�ߦ��t�<A�������!���B����.����
��xDHÈ�Cb�e�M��#Xg<h��?�����YD���k��)4�'�6��-b6���eY.��/D�BW<ܢ��^P��"��]�y�݅���T �`!.nE�j�4V�lםcQۥ�sUZ��M�U��c^�{�1�:�}c-�q�~iրev/�$Ȣ�:+C���F�;:TFҦ��i�B��((���HA{�C�t�kO�s�]" X��52	���9H7��e�	e���e���=� 즥�@����]~�D1��٤ݡ�m�(�ja��v��װ�{�'�� da�7���׷�T��v����j�
���H 5B���M7�h&1�|t�@���؈z�Ի���<��<�_v<���Pk��h��!}:����/�H�{ �t'E��>�����/�*��l��C�^DL}��@���� :�1�e��S	��ݟ%(�C��r�2ڼRC+�ŀ����AoJ����]ǩ���-�$�_`�jU���/�V0Bt����;R߶<�Pl�%P����I�����q��t�"j�#�e�i�=Kb����j��9U�a	�$#!�"�o��iW�\_��:D�
�
��?Ԣ��ڄ1�Zݿ�;�:F�էc4A�ODP+��1K�P:=*�������:�����Zw%���r��4sUʕ��{�Qƛ��N�4W�V<�D�o�-�2�<��:��&�M���F��D���!u�d��kO���( ߴ�'P9իѼ�>k�+��S�4��@�~�~���k$�E�*1uR��h�T9��/��E�ڗ� "�Q��ջ!�M�8�}
z�N(r��`�=�c�Z?��\�M��,��A!}�Y �����}���s�<�7N���1İ��w�W���Uxj����p�2+'8�:&c����x�ҡ�7m�rZ�f��i�Q�V�]ud±�j\��2|Q'�2^����Ґ���j"�!λ�_��Q\4m�_�7�u�-��U �|f����I ��ODp��C�����=��������	Q
�JS��Rl!�v~�g8��S��ٟ`W�W�U!�����Rq\>���u R�N���f�JRz�D+�[6�+��s��u��9�0���)�+���>�������È�\,��)��K��3�ʼ���P�E?uT�x���0�n�6M�:PS�들�r&�.��Z.�r��i�.2MK�=fN�)�Aޞ����՛��N��%P�Ђ�q�t#<�ی �L<,*�������mUZ7c�+Y�}��#T�]复���G�����Y/E�02�H@��i�Ee���*���݈N4�\qz:5�Sb��u]����0      �   k  x��TMs�0=K�bg:�KI�$>���6m':�t�����20���W�`hڦ��Fh�=����\����,�Rըɍ.j�]�	Lϸp`�YC�
�����y]���,����
����	�=��� x���%�b�9C/�Y@�8�h����[̟b����c���⃅Ί�ʁ�,�J�����?�S�Ph�1~91��t������c~��a�!������­�$�yS��F6�c���8��ͳ��0o�)|�q�AF�ģ��кx��`���M�Vp����ŁI[G0��>d&�F��wE��m�V�S��{�/j��G��
ݠ�
���`\�>�t�$�1�il5m��|�d���J�m����.[w{\k���S��!zã8�]F� �/��i)�
����b}�C^tu�����a�U�*�N����૬�	�y��0n�ID/��u�Vz�j�4X������ĝZ4��������6��[}��1�^���0��|�.���q�dn����(�&�U�'��N�tS�������@%z}/D��Cߎ������^au/Wh���h�/GCǚm'��[���ϲ90_S�q�]��G<%���)�����O      �   �  x����N�0���S�x��Ii9�e+�R�h��eJ,�cW��.o��?FE+
+��N2�����`?��Zu:�[Ԛm����0�Y���8�䣷�n

���F�m]�Qq�F1�
�R�E������� ,��%�1�ֶ�?'��V#Sbhr�_����ģ�y׮UZJC��gyY�y����[�!� +O����}�x���i|q
��(ekc�^��~R�b����u	u	��E�h$�~�S�y����	եG�*j-��S���$�Lh�:�lh���z���%� M�gh] %�  +�l�>�-�վ`뛫��*l�G�cȲ%�M^W�)2:�С	:1�y7/�y�!+�H���c=Ԯ�cV�}!��a�e�اG3v�Z�j�b��Jl�B����wHg�u�=�,l}疝1q��EQ���Z�      �     x��TMs�0=˿b�(Y�� Ӑ0fH�zY�416�m:��]�E(I�L>Hڷ���d�vC��ܬ5,j�MY����Gz�������ƍ��뺴s�tHS<H��
���mm_H_�^ߗR�q C!��1�[R��f���s�$�Ka\V{R��7���A�X(�!�Bk33�M0�݊��E���-�³a��`3,�]֣�ıR��s��)o8�@�o^�~��5LK	��3��amrb�+]�L���g�N�-�����%��0L�C��X�M�m�ke��z��n13��b�lqMI�`'��!�}#�:hX�<��H�?jZt!�Xb!5mW�[}-.ES�<�P�㡡ѹC�����8T��T��4��?��m��_��"o��3�V�d���ٙ�mn�Q�sB? ��bﱱ�ׅ�̴��&�ne�����>��R�!;�X�]��Xc��A[k[�y��i������Q�M��\���ߢ����*�-���E|���������/nG,�蟷���o����ᣫ      �   �  x����r�6Ư�S�U��b��{ ��4ғ�No(X���,'���s�ź2|
���	������owC�P.�7�����S���M��l�
�BK×�p��T̍�@]g�#�*�\͸t���/R�9��e�%�%4��8
(�}�w(�$����T�;���bd*�e
S�g0�����a�����R���3e W�āǏO��v�R��k!\A��/��i�b��/�u��)=r��\�D���禡�%)�8p���Mf��,P�\p���fp!gB�Ѝh�T�{��'�T�P�I2Q��)3�v��0sha�9SJ�a��Y����Y2�z5�ͽ�O�4V�A>� I�
W ��[�D�Gfx>
�pa���:�;��n䆖���E4p#�^xD�۫�n��JB|%�M3�W���`�.�>JW�h�+�q����MWd��aj�.`��Ⱦ=�����}����<����߲�(�</�N��ު�AYH\��6�*]���̗�|��l?>{|L&\��J�^�h�Rkl�K��J6�O�a�y;k��*�J�$�\3f�ͻ�	A�����[����Qh�nD��ҁ�{�:�Q�4����?��&H���qv��n��B�%s�K���oO\�9*�b�nVk�~,t����B�$��u+�Ľ[(%#�M*t�|���;����S�?W���Bp����6u���Jo0����^�!f��3����/$�9<qLǂ4j�Ȧ����S�nhw�*�/�c��y8���j�V2�LJ���6!
��4_XY1)����f�Go8�㕅�9o��l\�C�&�p���}����#�j����\���i�K�{-����+��6��X�Tͥ0���cA���&u���%�IG�Yx�#Ռ�����L�0��Uh,�ؾ_�Gta��Řg+����JQ>S���A�+/{����|�qC����������+�D���9����^����Y�y�so�g��K�ٶ��$��۩�v�s�$	�������	o�-��M���S��b��ؖ�f����-�X��`�*=C��f͋C+���K���6�i��d��9�<����n��R�K즷��76�W�^�qD:�c��&-���gV�Y�oRW�����=�q�v��[w�L>��v�Tkس�I&;��8�X"S�s���%�_G��M��D^3����U�)�?��l��S��r���>���0k��Mb��׉f^s��i�Z� ���g     