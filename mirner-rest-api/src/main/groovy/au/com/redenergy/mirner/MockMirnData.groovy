package au.com.redenergy.mirner

class MockMirnData {
    SearchResult mockSearch(Integer limit, Integer offset) {
        // Pretend filteredMirns is result after filtering, i.e. not ALL_MIRNS but ALL_MIRNS filtered
        ArrayList<MirnResult> filteredMirns = ALL_MIRNS.sort(false, { it.key })
        Long totalCount = ALL_MIRNS.size()
        Integer pageEndIndex = [(offset + limit), filteredMirns.size()].min()
        ArrayList<MirnResult> pagedMirns = filteredMirns.subList(offset, pageEndIndex)

        PagingResult pagingResult = new PagingResult()
        pagingResult.totalCount = totalCount
        pagingResult.limit = limit
        pagingResult.offset = offset
        pagingResult.lastPage = ((totalCount / limit) + 1) as Integer
        pagingResult.lastRecordKey = !pagedMirns.empty ? pagedMirns.last().key : ''
        SearchResult result = new SearchResult()
        result.pagingResult = pagingResult
        result.mirns = pagedMirns

        return result
    }

    static final ArrayList<MirnResult> ALL_MIRNS = [
            new MirnResult('5000000000', '100000', 'address for 5000000000', 'warning for 5000000000'),
            new MirnResult('5000000001', 'NOT PROVIDED', 'tower 1   60-96 MACAULAY RD, NORTH MELBOURNE 3051', 'Unclaimed Site'),
            new MirnResult('5000000002', '100002', 'address for 5000000002', 'warning for 5000000002'),
            new MirnResult('5000000003', '100003', 'address for 5000000003', 'warning for 5000000003'),
            new MirnResult('5000000004', '100004', 'address for 5000000004', 'warning for 5000000004'),
            new MirnResult('5000000005', '100005', 'address for 5000000005', 'warning for 5000000005'),
            new MirnResult('5000000006', '100006', 'address for 5000000006', 'warning for 5000000006'),
            new MirnResult('5000000007', '100007', 'address for 5000000007', 'warning for 5000000007'),
            new MirnResult('5000000008', '100008', 'address for 5000000008', 'warning for 5000000008'),
            new MirnResult('5000000009', '100009', 'address for 5000000009', 'warning for 5000000009'),
            new MirnResult('5000000010', '100010', 'address for 5000000010', 'warning for 5000000010'),
            new MirnResult('5000000011', '100011', 'address for 5000000011', 'warning for 5000000011'),
            new MirnResult('5000000012', '100012', 'address for 5000000012', 'warning for 5000000012'),
            new MirnResult('5000000013', '100013', 'address for 5000000013', 'warning for 5000000013'),
            new MirnResult('5000000014', '100014', 'address for 5000000014', 'warning for 5000000014'),
            new MirnResult('5000000015', '100015', 'address for 5000000015', 'warning for 5000000015'),
            new MirnResult('5000000016', '100016', 'address for 5000000016', 'warning for 5000000016'),
            new MirnResult('5000000017', '100017', 'address for 5000000017', 'warning for 5000000017'),
            new MirnResult('5000000018', '100018', 'address for 5000000018', 'warning for 5000000018'),
            new MirnResult('5000000019', '100019', 'address for 5000000019', 'warning for 5000000019'),
            new MirnResult('5000000020', '100020', 'address for 5000000020', 'warning for 5000000020'),
            new MirnResult('5000000021', '100021', 'address for 5000000021', 'warning for 5000000021'),
            new MirnResult('5000000022', '100022', 'address for 5000000022', 'warning for 5000000022'),
            new MirnResult('5000000023', '100023', 'address for 5000000023', 'warning for 5000000023'),
            new MirnResult('5000000024', '100024', 'address for 5000000024', 'warning for 5000000024'),
            new MirnResult('5000000025', '100025', 'address for 5000000025', 'warning for 5000000025'),
            new MirnResult('5000000026', '100026', 'address for 5000000026', 'warning for 5000000026'),
            new MirnResult('5000000027', '100027', 'address for 5000000027', 'warning for 5000000027'),
            new MirnResult('5000000028', '100028', 'address for 5000000028', 'warning for 5000000028'),
            new MirnResult('5000000029', '100029', 'address for 5000000029', 'warning for 5000000029'),
            new MirnResult('5000000030', '100030', 'address for 5000000030', 'warning for 5000000030'),
            new MirnResult('5000000031', '100031', 'address for 5000000031', 'warning for 5000000031'),
            new MirnResult('5000000032', '100032', 'address for 5000000032', 'warning for 5000000032'),
            new MirnResult('5000000033', '100033', 'address for 5000000033', 'warning for 5000000033'),
            new MirnResult('5000000034', '100034', 'address for 5000000034', 'warning for 5000000034'),
            new MirnResult('5000000035', '100035', 'address for 5000000035', 'warning for 5000000035'),
            new MirnResult('5000000036', '100036', 'address for 5000000036', 'warning for 5000000036'),
            new MirnResult('5000000037', '100037', 'address for 5000000037', 'warning for 5000000037'),
            new MirnResult('5000000038', '100038', 'address for 5000000038', 'warning for 5000000038'),
            new MirnResult('5000000039', '100039', 'address for 5000000039', 'warning for 5000000039'),
            new MirnResult('5000000040', '100040', 'address for 5000000040', 'warning for 5000000040'),
            new MirnResult('5000000041', '100041', 'address for 5000000041', 'warning for 5000000041'),
            new MirnResult('5000000042', '100042', 'address for 5000000042', 'warning for 5000000042'),
            new MirnResult('5000000043', '100043', 'address for 5000000043', 'warning for 5000000043'),
            new MirnResult('5000000044', '100044', 'address for 5000000044', 'warning for 5000000044'),
            new MirnResult('5000000045', '100045', 'address for 5000000045', 'warning for 5000000045'),
            new MirnResult('5000000046', '100046', 'address for 5000000046', 'warning for 5000000046'),
            new MirnResult('5000000047', '100047', 'address for 5000000047', 'warning for 5000000047'),
            new MirnResult('5000000048', '100048', 'address for 5000000048', 'warning for 5000000048'),
            new MirnResult('5000000049', '100049', 'address for 5000000049', 'warning for 5000000049'),
            new MirnResult('5000000050', '100050', 'address for 5000000050', 'warning for 5000000050'),
            new MirnResult('5000000051', '100051', 'address for 5000000051', 'warning for 5000000051'),
            new MirnResult('5000000052', '100052', 'address for 5000000052', 'warning for 5000000052'),
            new MirnResult('5000000053', '100053', 'address for 5000000053', 'warning for 5000000053'),
            new MirnResult('5000000054', '100054', 'address for 5000000054', 'warning for 5000000054'),
            new MirnResult('5000000055', '100055', 'address for 5000000055', 'warning for 5000000055'),
            new MirnResult('5000000056', '100056', 'address for 5000000056', 'warning for 5000000056'),
            new MirnResult('5000000057', '100057', 'address for 5000000057', 'warning for 5000000057'),
            new MirnResult('5000000058', '100058', 'address for 5000000058', 'warning for 5000000058'),
            new MirnResult('5000000059', '100059', 'address for 5000000059', 'warning for 5000000059'),
            new MirnResult('5000000060', '100060', 'address for 5000000060', 'warning for 5000000060'),
            new MirnResult('5000000061', '100061', 'address for 5000000061', 'warning for 5000000061'),
            new MirnResult('5000000062', '100062', 'address for 5000000062', 'warning for 5000000062'),
            new MirnResult('5000000063', '100063', 'address for 5000000063', 'warning for 5000000063'),
            new MirnResult('5000000064', '100064', 'address for 5000000064', 'warning for 5000000064'),
            new MirnResult('5000000065', '100065', 'address for 5000000065', 'warning for 5000000065'),
            new MirnResult('5000000066', '100066', 'address for 5000000066', 'warning for 5000000066'),
            new MirnResult('5000000067', '100067', 'address for 5000000067', 'warning for 5000000067'),
            new MirnResult('5000000068', '100068', 'address for 5000000068', 'warning for 5000000068'),
            new MirnResult('5000000069', '100069', 'address for 5000000069', 'warning for 5000000069'),
            new MirnResult('5000000070', '100070', 'address for 5000000070', 'warning for 5000000070'),
            new MirnResult('5000000071', '100071', 'address for 5000000071', 'warning for 5000000071'),
            new MirnResult('5000000072', '100072', 'address for 5000000072', 'warning for 5000000072'),
            new MirnResult('5000000073', '100073', 'address for 5000000073', 'warning for 5000000073'),
            new MirnResult('5000000074', '100074', 'address for 5000000074', 'warning for 5000000074'),
            new MirnResult('5000000075', '100075', 'address for 5000000075', 'warning for 5000000075'),
            new MirnResult('5000000076', '100076', 'address for 5000000076', 'warning for 5000000076'),
            new MirnResult('5000000077', '100077', 'address for 5000000077', 'warning for 5000000077'),
            new MirnResult('5000000078', '100078', 'address for 5000000078', 'warning for 5000000078'),
            new MirnResult('5000000079', '100079', 'address for 5000000079', 'warning for 5000000079'),
            new MirnResult('5000000080', '100080', 'address for 5000000080', 'warning for 5000000080'),
            new MirnResult('5000000081', '100081', 'address for 5000000081', 'warning for 5000000081'),
            new MirnResult('5000000082', '100082', 'address for 5000000082', 'warning for 5000000082'),
            new MirnResult('5000000083', '100083', 'address for 5000000083', 'warning for 5000000083'),
            new MirnResult('5000000084', '100084', 'address for 5000000084', 'warning for 5000000084'),
            new MirnResult('5000000085', '100085', 'address for 5000000085', 'warning for 5000000085'),
            new MirnResult('5000000086', '100086', 'address for 5000000086', 'warning for 5000000086'),
            new MirnResult('5000000087', '100087', 'address for 5000000087', 'warning for 5000000087'),
            new MirnResult('5000000088', '100088', 'address for 5000000088', 'warning for 5000000088'),
            new MirnResult('5000000089', '100089', 'address for 5000000089', 'warning for 5000000089'),
            new MirnResult('5000000090', '100090', 'address for 5000000090', 'warning for 5000000090'),
            new MirnResult('5000000091', '100091', 'address for 5000000091', 'warning for 5000000091'),
            new MirnResult('5000000092', '100092', 'address for 5000000092', 'warning for 5000000092'),
            new MirnResult('5000000093', '100093', 'address for 5000000093', 'warning for 5000000093'),
            new MirnResult('5000000094', '100094', 'address for 5000000094', 'warning for 5000000094'),
            new MirnResult('5000000095', '100095', 'address for 5000000095', 'warning for 5000000095'),
            new MirnResult('5000000096', '100096', 'address for 5000000096', 'warning for 5000000096'),
            new MirnResult('5000000097', '100097', 'address for 5000000097', 'warning for 5000000097'),
            new MirnResult('5000000098', '100098', 'address for 5000000098', 'warning for 5000000098'),
            new MirnResult('5000000099', '100099', 'address for 5000000099', 'warning for 5000000099'),
            new MirnResult('5000000100', '100100', 'address for 5000000100', 'warning for 5000000100'),
            new MirnResult('5000000101', '100101', 'address for 5000000101', 'warning for 5000000101'),
            new MirnResult('5000000102', '100102', 'address for 5000000102', 'warning for 5000000102'),
            new MirnResult('5000000103', '100103', 'address for 5000000103', 'warning for 5000000103'),
            new MirnResult('5000000104', '100104', 'address for 5000000104', 'warning for 5000000104'),
            new MirnResult('5000000105', '100105', 'address for 5000000105', 'warning for 5000000105')
    ]
}
